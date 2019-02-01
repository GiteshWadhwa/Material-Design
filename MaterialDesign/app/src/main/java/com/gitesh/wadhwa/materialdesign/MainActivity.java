package com.gitesh.wadhwa.materialdesign;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void doSomething(View view){
        AlertDialog.Builder myAlert=new AlertDialog.Builder(this);
        myAlert.setTitle("ADD");
        myAlert.setMessage("Data is added");
        myAlert.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
              dialogInterface.dismiss();
            }
        });
        myAlert.show();
    }
}
