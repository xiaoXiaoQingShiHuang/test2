package edu.worldskills.c0718;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView tv_name = findViewById(R.id.tv_name);
        TextView tv_price = findViewById(R.id.tv_price);
        ImageView iv_cat = findViewById(R.id.iv_cat);

        AlphaAnimation alphaAnimation = new AlphaAnimation(0f,1f);
        alphaAnimation.setStartOffset(1000);
        alphaAnimation.setDuration(1000);
        tv_name.setAnimation(alphaAnimation);

        ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f,1.0f,0.5f,1.0f,
                Animation.RELATIVE_TO_SELF, 0.5f,Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(2000);
        tv_price.setAnimation(scaleAnimation);

        TranslateAnimation translateAnimation = new TranslateAnimation(400,0,0,0);
        translateAnimation.setDuration(2000);
        iv_cat.setAnimation(translateAnimation);

    }
}