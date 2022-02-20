package com.example.activitylifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.activitylifecycleapp.helpers.CounterHelper;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        Log.e("onCreate ------ ", "ActivityC: onCreate()");

    }
    public void btn_closeActivityC(View view){
        finish();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart ------ ","ActivityC: onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume ------ ","ActivityC: onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause ------ ","ActivityC: onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop ------ ","ActivityC: onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy ------ ","ActivityC: onDestroy()");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        CounterHelper.incrementCounter();
        Log.e("onRestart ------ ","ActivityC: onRestart()");
    }
}