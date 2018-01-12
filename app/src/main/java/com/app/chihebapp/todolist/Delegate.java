package com.app.chihebapp.todolist;

import android.app.Dialog;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Delegate extends AppCompatActivity {

    private Dialog MyDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delegate);

        //this for the textSlider
        TextView textSlider_delegate = (TextView) findViewById(R.id.textSlider_delegate);
        textSlider_delegate.setSelected(true);

        Button back = (Button) findViewById(R.id.back_delegate);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        //this for add button :
        Button add = (Button) findViewById(R.id.add_delegate);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Opening the Alert Dailog !");
                MyCostomizeAlertDialog();
            }
        });
    }


    //Define the MyCostomizeAlertDialog() methode
    private void MyCostomizeAlertDialog() {
    MyDialog =new Dialog(Delegate.this);
    MyDialog.setContentView(R.layout.activity_costomize_alert_dialog);
    MyDialog.show();
    }

}







