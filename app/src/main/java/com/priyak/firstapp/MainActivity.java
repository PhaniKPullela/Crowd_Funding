package com.priyak.firstapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    Button bt ;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       bt = (Button) findViewById(R.id.button) ;
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(myIntent) ;

            }
    }) ;
    }

  public void OnExit(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this) ;
        builder.setMessage("Do you want to Exit?") ;
        builder.setCancelable(true) ;
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {
                finish() ;
            }
        }) ;
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id)
            {
                dialog.cancel();
            }
        }) ;
        AlertDialog alert = builder.create() ;
        alert.show() ;
    }

}
