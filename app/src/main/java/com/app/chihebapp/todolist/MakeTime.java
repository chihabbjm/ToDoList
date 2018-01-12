package com.app.chihebapp.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MakeTime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_time);

        //this for make the SliderText:
        TextView textSlider_makeTime=(TextView)findViewById(R.id.textSlider_makeTime);
        textSlider_makeTime.setSelected(true);

        Button back =(Button)findViewById(R.id.back_makeTime);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
