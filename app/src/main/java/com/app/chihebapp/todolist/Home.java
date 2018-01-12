package com.app.chihebapp.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button button_n_1 =(Button)findViewById(R.id.button_n_1);
        Button button_n_2 =(Button)findViewById(R.id.button_n_2);
        Button button_n_3 =(Button)findViewById(R.id.button_n_3);

        button_n_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Cretae New Intenet after that make start of the Intent :
                Intent Do_It =new Intent(getApplicationContext(),DoItNow.class);
                System.out.println("Do It Now ! Intenet ");
                startActivity(Do_It);
                //TODO show the His prograsse Bar :

            }
        });

        button_n_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Cretae New Intenet after that make start of the Intent :
                Intent MakeTime =new Intent(getApplicationContext(),MakeTime.class);
                System.out.println("Make Time For It ! Intenet ");
                startActivity(MakeTime);
                //TODO show the His prograsse Bar :
            }
        });

        button_n_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Cretae New Intenet after that make start of the Intent :
                Intent Delegate =new Intent(getApplicationContext(),Delegate.class);
                System.out.println("Delegate ! Intenet ");
                startActivity(Delegate);
                //TODO show the His prograsse Bar :
            }
        });



    }


}
