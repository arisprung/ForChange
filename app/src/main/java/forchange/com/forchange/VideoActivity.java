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
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v13.app.FragmentCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Random;

import static android.os.Environment.getExternalStoragePublicDirectory;

/**
 * Created by arisprung on 11/19/16.
 */

public class VideoActivity extends Activity implements MediaPlayer.OnCompletionListener {
    private static final String FRAGMENT_DIALOG = "dialog";
    private VideoView mVV;
    private static final String[] READ_EXTERNAL_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,

    };
    private Button mShare;
    private MediaPlayer mediaPlayer;
    private static final int REQUEST_VIDEO_PERMISSIONS = 2;

    @Override
    public void onCreate(Bundle b) {
        super.onCreate(b);

        setContentView(R.layout.videoplayer);

        ImageView view = (ImageView) findViewById(R.id.download);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendFile();


            }
        });

        mediaPlayer = MediaPlayer.create(VideoActivity.this, R.raw.dna_3);
        mediaPlayer.start();
//
//        if (!hasPermissionsGranted(READ_EXTERNAL_STORAGE)) {
//            requestVideoPermissions();
//            return;
//        }
    }

    private void sendFile() {

        File f = new File(getVideoFilePath());
        String s = f.getAbsolutePath();
        if (f.exists()) {
            Toast.makeText(getApplicationContext(),"Downloaded video to Gallery",Toast.LENGTH_SHORT).show();
            MediaScannerConnection.scanFile(getApplicationContext(), new String[] { f.getAbsolutePath() }, null,
                    new MediaScannerConnection.OnScanCompletedListener() {


                        @Override
                        public void onScanCompleted(String path, Uri uri) {

//                        Intent intent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
//                        intent.setData(uri);
//                        sendBroadcast(intent);

                            Log.d("","");


                        }
                    });
        }
        //sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.fromFile(imageAdded)));



    }


    private boolean hasPermissionsGranted(String[] permissions) {
        for (String permission : permissions) {
            if (android.support.v4.app.ActivityCompat.checkSelfPermission(VideoActivity.this, permission)
                    != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }

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
            if (android.support.v13.app.ActivityCompat.shouldShowRequestPermissionRationale(VideoActivity.this, permission)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);


    }

    /**
     * Requests permissions needed for recording video.
     */
    private void requestVideoPermissions() {
        if (shouldShowRequestPermissionRationale(READ_EXTERNAL_STORAGE)) {
            new ConfirmationDialog().show(getFragmentManager(), FRAGMENT_DIALOG);
        } else {
            android.support.v13.app.ActivityCompat.requestPermissions(this, READ_EXTERNAL_STORAGE, REQUEST_VIDEO_PERMISSIONS);
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
                            FragmentCompat.requestPermissions(parent, READ_EXTERNAL_STORAGE,
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


    @Override
    protected void onResume() {
        super.onResume();
        mShare = (Button) findViewById(R.id.share);

        mVV = (VideoView) findViewById(R.id.videoView1);
        getWindow().setBackgroundDrawableResource(android.R.color.white);

        mVV.setVideoPath(getVideoFilePath());
        mVV.start();
        mVV.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        mShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareService();
            }
        });
    }

    @Override
    public void onCompletion(MediaPlayer mediaPlayer) {
        //finish();


    }

    private String getVideoFilePath() {

        return Environment.getExternalStorageDirectory().getAbsolutePath()
                + File.separator + "DCIM/Camera/orchange_video.mp4";
    }

    private void shareService() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "I just found out my genetic DNA on my mobile! #ForChange2016 Find out yours:" + "\n"
                + "http://purednatest.wixsite.com/purednatest");
        Intent chooser = Intent.createChooser(intent, "Share app");
        chooser.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(chooser);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }


}