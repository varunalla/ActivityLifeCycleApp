package com.example.activitylifecycleapp;

import static org.junit.Assert.assertEquals;

import com.example.activitylifecycleapp.helpers.CounterHelper;

import org.junit.Test;

public class CounterHelperUnitTest {
    @Test
    public void addition_isCorrect() {
        CounterHelper.clearACounter();
        CounterHelper.incrementACounter();
        assertEquals(1, CounterHelper.getRestartACounter());
    }
}
