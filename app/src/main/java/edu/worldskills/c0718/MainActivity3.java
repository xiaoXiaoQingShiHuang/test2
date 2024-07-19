package edu.worldskills.c0718;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button btn_show = findViewById(R.id.btn_show);
        btn_show.setOnClickListener(v->{
            Intent i = new Intent(this,MainActivity4.class);
            startActivity(i);
        });
    }
}