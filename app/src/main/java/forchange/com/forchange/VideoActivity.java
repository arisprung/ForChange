package forchange.com.forchange;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.VideoView;

import static forchange.com.forchange.R.id.share;

/**
 * Created by arisprung on 11/19/16.
 */

public class VideoActivity extends Activity  implements MediaPlayer.OnCompletionListener {

    private VideoView mVV;

    private Button mShare;

    @Override
    public void onCreate(Bundle b) {
        super.onCreate(b);

        setContentView(R.layout.videoplayer);

        ImageView view = (ImageView)findViewById(R.id.download);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Downloaded video to SD card",Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        mShare = (Button)findViewById(R.id.share);

        mVV = (VideoView)findViewById(R.id.videoView1);
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
        return getApplicationContext().getExternalFilesDir(null).getAbsolutePath() + "/forchange_video.mp4";
    }

    private void shareService() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "I just found out my genetic DNA on my mobile! #ForChange2016 Find out yours:"  + "\n"
                + "http://purednatest.wixsite.com/purednatest");
        Intent chooser = Intent.createChooser(intent, "Share app");
        chooser.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(chooser);
    }
}