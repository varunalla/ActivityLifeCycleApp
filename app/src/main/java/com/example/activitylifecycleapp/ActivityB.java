package com.example.activitylifecycleapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.activitylifecycleapp.helpers.CounterHelper;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        if(savedInstanceState!=null){
            int count=savedInstanceState.getInt("activityBRestartCount");
            System.out.println("Got Value inside activity B "+count);
        }
        else{
            Bundle bundle = getIntent().getExtras();
            if(bundle!=null) {
                int count = bundle.getInt("activityBRestartCount");
                System.out.println("Got Value inside activity B " + count);
            }
        }
        Log.e("onCreate ------ ", "ActivityB: onCreate()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart ------ ","ActivityB: onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume ------ ","ActivityB: onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause ------ ","ActivityB: onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop ------ ","ActivityB: onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy ------ ","ActivityB: onDestroy()");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        CounterHelper.incrementCounter();
        CounterHelper.incrementBCounter();
        Log.e("onRestart ------ ","ActivityB: onRestart()");
    }
    @Override
    protected void onSaveInstanceState(@NonNull  Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("activityBRestartCount",CounterHelper.getRestartBCounter());
    }
    public void btn_closeActivityB(View view){
        finish();
    }
}