package com.app.chihebapp.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DoItNow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_it_now);

        //this for the sliderText ;
        TextView textSlider_DoItNow=(TextView)findViewById(R.id.textSlider_DoItNow);
        textSlider_DoItNow.setSelected(true);

        Button back =(Button)findViewById(R.id.back_DoItNow);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
