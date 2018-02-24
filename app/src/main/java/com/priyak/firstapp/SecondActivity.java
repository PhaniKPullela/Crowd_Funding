package com.priyak.firstapp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void OnBack(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(SecondActivity.this) ;
        builder.setMessage("Do you want to go Back?") ;
        builder.setCancelable(true) ;
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {
                finish();
            }
        }) ;
       builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id)
            {
                dialog.cancel();
            }
        }) ;
        AlertDialog alert = builder.create();
        alert.show();
    }

}

