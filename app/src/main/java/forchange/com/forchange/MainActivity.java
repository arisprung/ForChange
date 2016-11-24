//package forchange.com.forchange;
//
//import android.content.Context;
//import android.graphics.Bitmap;
//import android.graphics.Canvas;
//import android.graphics.Color;
//import android.graphics.Paint;
//import android.graphics.Path;
//import android.graphics.PorterDuff;
//import android.os.CountDownTimer;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.MotionEvent;
//import android.view.View;
//import android.view.animation.AlphaAnimation;
//import android.view.animation.AnimationUtils;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//
//
//
//import java.io.File;
//import java.io.FileOutputStream;
//
//import static android.R.attr.x;
//
//public class MainActivity extends AppCompatActivity {
//
//    private  DrawingView dv;
//    private Paint mPaint;
//    private View mSplashView;
//
//    private CountDownTimer countDownTimer;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        dv = new DrawingView(getApplicationContext());
//        countDownTimer = new AnimationCountDownTimer(5000, 1000);
//        mDrawingPad.addView(dv);
//        mPaint = new Paint();
//        //  mPaint.setAntiAlias(true);
//        // mPaint.setDither(true);
//        mPaint.setColor(Color.BLUE);
//        mPaint.setStyle(Paint.Style.STROKE);
//        mPaint.setStrokeJoin(Paint.Join.ROUND);
//        mPaint.setStrokeCap(Paint.Cap.ROUND);
//        mPaint.setStrokeWidth(300);
//        rippleBackground =(RippleBackground)findViewById(R.id.content);
//    }
//
//
//    public class DrawingView extends View {
//
//        public int width;
//        public int height;
//        private Bitmap mBitmap;
//        public Canvas mCanvas;
//        private Path mPath;
//        private Paint mBitmapPaint;
//        Context context;
//        private Paint circlePaint;
//        private Path circlePath;
//
//        public DrawingView(Context c) {
//            super(c);
//            context = c;
//            mPath = new Path();
//            mBitmapPaint = new Paint(Paint.DITHER_FLAG);
//            circlePaint = new Paint();
//            circlePath = new Path();
//            circlePaint.setAntiAlias(true);
//            circlePaint.setColor(Color.BLUE);
//            circlePaint.setStyle(Paint.Style.STROKE);
//            circlePaint.setStrokeJoin(Paint.Join.MITER);
//            circlePaint.setStrokeWidth(4f);
//        }
//
//        @Override
//        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
//            super.onSizeChanged(w, h, oldw, oldh);
//
//            mBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
//            mCanvas = new Canvas(mBitmap);
//
//        }
//
//        @Override
//        protected void onDraw(Canvas canvas) {
//            super.onDraw(canvas);
//
//            canvas.drawBitmap(mBitmap, 0, 0, mBitmapPaint);
//            canvas.drawPath(mPath, mPaint);
//            canvas.drawPath(circlePath, circlePaint);
//        }
//
//        private float mX, mY;
//        private static final float TOUCH_TOLERANCE = 4;
//
//        private void touch_start(float x, float y) {
//
//
//            mPath.reset();
//            mPath.moveTo(x, y);
//            mX = x;
//            mY = y;
//        }
//
//        private void touch_move(float x, float y) {
//            float dx = Math.abs(x - mX);
//            float dy = Math.abs(y - mY);
//            if (dx >= TOUCH_TOLERANCE || dy >= TOUCH_TOLERANCE) {
//                mPath.quadTo(mX, mY, (x + mX) / 2, (y + mY) / 2);
//                mX = x;
//                mY = y;
//
//                circlePath.reset();
//                //  circlePath.addCircle(mX, mY, 30, Path.Direction.CW);
//            }
//        }
//
//        private void touch_up() {
//            mPath.lineTo(mX, mY);
//            circlePath.reset();
//            // commit the path to our offscreen
//            mCanvas.drawPath(mPath, mPaint);
//            // kill this so we don't double draw
//            mPath.reset();
//
//            startAnimationOnSplash();
//            AlphaAnimation alpha = new AlphaAnimation(1.0f,0.0f);
//            alpha.setFillAfter(true);
//            alpha.setDuration(2000);
//            dv.startAnimation(alpha);
//
//        }
//
//        @Override
//        public boolean onTouchEvent(MotionEvent event) {
//            float x = event.getX();
//            float y = event.getY();
//
//            switch (event.getAction()) {
//                case MotionEvent.ACTION_DOWN:
//                    touch_start(x, y);
//                    invalidate();
//                    break;
//                case MotionEvent.ACTION_MOVE:
//                    touch_move(x, y);
//                    invalidate();
//                    break;
//                case MotionEvent.ACTION_UP:
//                    touch_up();
//                    invalidate();
//                    break;
//            }
//            return true;
//        }
//
//        public Canvas getmCanvas() {
//            return mCanvas;
//        }
//
//        public void setmCanvas(Canvas mCanvas) {
//            this.mCanvas = mCanvas;
//        }
//
//        public void clearDrawing(){
//            mCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
//            invalidate();
//
//        }
//
//    }
//
//    private void startAnimationOnSplash() {
//        rippleBackground.startRippleAnimation();
//    }
//    public class AnimationCountDownTimer extends CountDownTimer {
//        public AnimationCountDownTimer(long startTime, long interval) {
//            super(startTime, interval);
//        }
//
//        @Override
//        public void onFinish() {
//            rippleBackground.startRippleAnimation();
//            //startActivity(getApplicationContext(),);
//        }
//
//        @Override
//        public void onTick(long millisUntilFinished) {
//        }
//    }
//
//
//}
