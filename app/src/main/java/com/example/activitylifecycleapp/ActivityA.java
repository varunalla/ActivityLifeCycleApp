package com.example.activitylifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Log.e("onCreate ------ ", "ActivityA: onCreate()");

    }
    public void btn_openActivityB(View view){
        Intent activityB=new Intent(this,ActivityB.class);
        startActivity(activityB);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart ------ ","ActivityA: onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume ------ ","ActivityA: onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause ------ ","ActivityA: onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop ------ ","ActivityA: onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy ------ ","ActivityA: onDestroy()");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart ------ ","ActivityA: onRestart()");
    }
}