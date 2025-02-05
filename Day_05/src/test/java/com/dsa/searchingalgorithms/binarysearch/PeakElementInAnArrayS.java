package com.dsa.searchingalgorithms.binarysearch;

import com.dsa.searchingalgorithm.binarysearch.peakelementinarray.PeakElementInAnArray;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PeakElementInAnArrayS {
    @Test
    public void testPeakElement() {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peak = PeakElementInAnArray.peakElementInAnArray(arr);

        // Check if peak is valid
        assertTrue((peak == arr[1]) || (peak == arr[2]) || (peak == arr[3]));

        System.out.println("Test Passed!");
    }
}
