package com.example.activitylifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.activitylifecycleapp.helpers.CounterHelper;

public class ActivityA extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        if(savedInstanceState!=null&&savedInstanceState.containsKey("activityBRestartCount")) {
            int count=savedInstanceState.getInt("activityBRestartCount");
            System.out.println("Got Value "+count);
        }
        else
            System.out.println("Fresh Launch");
        Log.e("onCreate ------ ", "ActivityA: onCreate()");

    }
    public void btn_openActivityB(View view){
        Intent activityB=new Intent(this,ActivityB.class);
        Bundle b=new Bundle();
        b.putInt("activityBRestartCount",CounterHelper.getRestartBCounter());
        activityB.putExtras(b);
        startActivity(activityB);
    }
    public void btn_openActivityC(View view){
        Intent activityC=new Intent(this,ActivityC.class);
        startActivity(activityC);
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
        CounterHelper.incrementCounter();
        Log.e("onRestart ------ ","ActivityA: onRestart()");
    }
}