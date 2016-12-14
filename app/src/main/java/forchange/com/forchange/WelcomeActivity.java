package forchange.com.forchange;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v13.app.FragmentCompat;
import android.support.v4.app.ActivityCompat;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

/**
 * Created by arisprung on 11/20/16.
 */

public class WelcomeActivity extends Activity {
    private static final String[] VIDEO_PERMISSIONS = {
            Manifest.permission.CAMERA,
            Manifest.permission.RECORD_AUDIO,
            Manifest.permission.VIBRATE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE
    };
    private static final String FRAGMENT_DIALOG = "dialog";
    private static final int REQUEST_VIDEO_PERMISSIONS = 1;
    private TextView terms;
    //private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.welcome_layout);
        Button button = (Button)findViewById(R.id.start);
         terms = (TextView)findViewById(R.id.terms);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                if(mediaPlayer != null){
//                    mediaPlayer.stop();
//                }

                finish();
                startActivity(new Intent(getApplicationContext(),CameraActivity.class));
            }
        });
        if (!hasPermissionsGranted(VIDEO_PERMISSIONS)) {
            requestVideoPermissions();
            return;
        }

        initSpannableText();


//        try
//        {
//            mediaPlayer = MediaPlayer.create(WelcomeActivity.this, R.raw.dna_1);
//            mediaPlayer.start();
//        }catch (Exception e){
//            e.printStackTrace();
//        }



    }

    private void initSpannableText() {
        SpannableString ss = new SpannableString(getResources().getString(R.string.sign_up_term_of_use));
        ss.setSpan(new myClickableSpan(1), 62, 80, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        terms.setText(ss);
        terms.setMovementMethod(LinkMovementMethod.getInstance());
    }


    private boolean hasPermissionsGranted(String[] permissions) {
        for (String permission : permissions) {
            if (ActivityCompat.checkSelfPermission(WelcomeActivity.this, permission)
                    != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//               startRecordingVideo();
//            }
//        }, 2000);

        return true;
    }

    /**
     * Gets whether you should show UI with rationale for requesting permissions.
     *
     * @param permissions The permissions your app wants to request.
     * @return Whether you can show permission rationale UI.
     */
    private boolean shouldShowRequestPermissionRationale(String[] permissions) {
        for (String permission : permissions) {
            if (android.support.v13.app.ActivityCompat.shouldShowRequestPermissionRationale(WelcomeActivity.this, permission)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Requests permissions needed for recording video.
     */
    private void requestVideoPermissions() {
        if (shouldShowRequestPermissionRationale(VIDEO_PERMISSIONS)) {
            new ConfirmationDialog().show(getFragmentManager(), FRAGMENT_DIALOG);
        } else {
            android.support.v13.app.ActivityCompat.requestPermissions(this, VIDEO_PERMISSIONS, REQUEST_VIDEO_PERMISSIONS);
        }
    }


    public static class ConfirmationDialog extends DialogFragment {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            final Fragment parent = getParentFragment();
            return new AlertDialog.Builder(getActivity())
                    .setMessage(R.string.permission_request)
                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            FragmentCompat.requestPermissions(parent, VIDEO_PERMISSIONS,
                                    REQUEST_VIDEO_PERMISSIONS);
                        }
                    })
                    .setNegativeButton(android.R.string.cancel,
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    parent.getActivity().finish();
                                }
                            })
                    .create();
        }

    }

    public class myClickableSpan extends ClickableSpan {
        int pos;

        public myClickableSpan(int position) {
            this.pos = position;
        }

        @Override
        public void updateDrawState(TextPaint ds) {
            ds.setUnderlineText(true);

        }

        @Override
        public void onClick(View widget) {
            Log.e("","");
//            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
           startActivity(new Intent(getApplicationContext(),TermsActivity.class));
        }
    }

//    @Override
//    protected void onStop() {
//        super.onStop();
//        if(mediaPlayer != null){
//            mediaPlayer.stop();
//        }
//    }
}
