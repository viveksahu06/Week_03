package com.stringbuffer;

import org.junit.Test;
import static org.junit.Assert.*;

public class CompareStringBufferWithStringBuilderTest {

    private static final int ITERATIONS = 1_000_000;

    @Test
    public void testStringBuilderPerformance() {
        long startTime = System.nanoTime();
        StringBuilder sbd = new StringBuilder("Java");
        for (int i = 0; i < ITERATIONS; i++) {
            sbd.append(" hello");
        }
        long endTime = System.nanoTime();

        long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds
        System.out.println("StringBuilder Time: " + duration + " ms");

        assertTrue("StringBuilder should take reasonable time", duration > 0);
    }

    @Test
    public void testStringBufferPerformance() {
        long startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer("Java");
        for (int i = 0; i < ITERATIONS; i++) {
            sbf.append(" hello");
        }
        long endTime = System.nanoTime();

        long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds
        System.out.println("StringBuffer Time: " + duration + " ms");

        assertTrue("StringBuffer should take reasonable time", duration > 0);
    }
}
