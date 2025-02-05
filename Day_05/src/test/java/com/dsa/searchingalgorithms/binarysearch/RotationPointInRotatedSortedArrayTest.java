package com.dsa.searchingalgorithms.binarysearch;

import com.dsa.searchingalgorithm.binarysearch.rotationpointinrotatedsortedarray.RotationPointInRotatedSortedArray;
import org.junit.Test;
import static org.junit.Assert.*;

public class RotationPointInRotatedSortedArrayTest {

    @Test
    public void testRotationPoint() {
        int[] arr1 = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(4, RotationPointInRotatedSortedArray.rotationPointInRotatedSortedArray(arr1));

        int[] arr2 = {10, 15, 20, 1, 3, 5, 7};
        assertEquals(3, RotationPointInRotatedSortedArray.rotationPointInRotatedSortedArray(arr2));

        int[] arr3 = {30, 40, 50, 10, 20};
        assertEquals(3, RotationPointInRotatedSortedArray.rotationPointInRotatedSortedArray(arr3));

        int[] arr4 = {1, 2, 3, 4, 5}; // Already sorted (not rotated)
        assertEquals(0, RotationPointInRotatedSortedArray.rotationPointInRotatedSortedArray(arr4));

        int[] arr5 = {5, 6, 1, 2, 3, 4}; // Rotation at index 2
        assertEquals(2, RotationPointInRotatedSortedArray.rotationPointInRotatedSortedArray(arr5));

        System.out.println("All Test Cases Passed!");
    }
}
