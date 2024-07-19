package edu.worldskills.c0718;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn_sing_in = findViewById(R.id.btn_sing_in);
        EditText ed_pwd = findViewById(R.id.ed_pwd);
        ImageView iv_show = findViewById(R.id.iv_show);
        Button btn_index = findViewById(R.id.btn_index);

        int d = ed_pwd.getInputType();
        iv_show.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        ed_pwd.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
                        break;
                    case MotionEvent.ACTION_UP:
                        ed_pwd.setInputType(d);
                        break;
                }
                return true;
            }
        });

        btn_sing_in.setOnClickListener(v->{
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        });

        btn_index.setOnClickListener(v->{

        });
    }
}