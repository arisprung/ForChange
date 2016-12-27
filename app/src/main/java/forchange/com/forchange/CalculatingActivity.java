package forchange.com.forchange;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

/**
 * Created by arisprung on 11/20/16.
 */

public class CalculatingActivity extends Activity {
    AnimationDrawable rocketAnimation;
    String strFile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculate_layout);
         strFile = getIntent().getStringExtra("file_name");
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(getApplicationContext(),VideoActivity.class);
                intent.putExtra("file_name",strFile);
                startActivity(intent);
                finish();
            }
        }, 3000);


        ImageView rocketImage = (ImageView) findViewById(R.id.calculate_image_animate);
        rocketImage.setBackgroundResource(R.drawable.animation_calculatibg);
        rocketAnimation = (AnimationDrawable) rocketImage.getBackground();
        rocketAnimation.start();
    }
}
