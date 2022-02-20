package com.example.activitylifecycleapp.helpers;

public class CounterHelper {
    private static  int restartACounter;
    private static int restartBCounter;
    private static int restartCCounter;
    public static void clearACounter(){
        restartACounter=0;
    }
    public static void clearBCounter(){
        restartBCounter=0;
    }
    public static void clearCCounter(){
        restartCCounter=0;
    }
    public static int incrementACounter(){
        return ++restartACounter;
    }
    public static  int getRestartACounter(){
        return restartACounter;
    }
    public static int incrementBCounter(){
        return ++restartBCounter;
    }
    public static  int getRestartBCounter(){
        return restartBCounter;
    }
    public static int incrementCCounter(){
        return ++restartCCounter;
    }
    public static  int getRestartCCounter(){
        return restartCCounter;
    }
}
