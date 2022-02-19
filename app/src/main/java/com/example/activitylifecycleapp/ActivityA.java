package com.example.activitylifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }
    public void btn_openActivityB(View view){
        Intent activityB=new Intent(this,ActivityB.class);
        startActivity(activityB);
    }
}