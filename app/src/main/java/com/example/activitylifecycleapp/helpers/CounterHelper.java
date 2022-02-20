package com.example.activitylifecycleapp.helpers;

public class CounterHelper {
    private static  int restartCounter;
    private static int restartBCounter;
    public static int incrementCounter(){
        return ++restartCounter;
    }
    public static  int getRestartCounter(){
        return restartCounter;
    }
    public static int incrementBCounter(){
        return ++restartCounter;
    }
    public static  int getRestartBCounter(){
        return restartCounter;
    }
}
