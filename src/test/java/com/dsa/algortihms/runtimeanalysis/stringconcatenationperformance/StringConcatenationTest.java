package com.dsa.algortihms.runtimeanalysis.stringconcatenationperformance;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringConcatenationTest{

    @Test
    public void testStringConcatenationPerformance() {
        int size = 1000;
        long startTime = System.currentTimeMillis();
        StringConcatenation.concatenateWithString(size);
        long elapsedTime = System.currentTimeMillis() - startTime;

        assertTrue(elapsedTime < 5000);
        System.out.println(elapsedTime);
        System.out.println("String concatenation took too long!");
    }

    @Test
    public void testStringBuilderPerformance() {
        int size = 100000;
        long startTime = System.currentTimeMillis();
        StringBuilderConcatenation.concatenateWithStringBuilder(size);
        long elapsedTime = System.currentTimeMillis() - startTime;

        assertTrue(elapsedTime < 500);
        System.out.println(elapsedTime);
        System.out.println("StringBuilder concatenation took too long!");
    }

    @Test
    public void testStringBufferPerformance() {
        int size = 100000;
        long startTime = System.currentTimeMillis();
        StringBufferConcatenation.concatenateWithString(size);
        long elapsedTime = System.currentTimeMillis() - startTime;

        assertTrue(elapsedTime < 600);
        System.out.println(elapsedTime);
        System.out.println("StringBuffer concatenation took too long!");
    }
}
