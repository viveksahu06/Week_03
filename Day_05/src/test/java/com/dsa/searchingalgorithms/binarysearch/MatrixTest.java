package com.dsa.searchingalgorithms.binarysearch;

import com.dsa.searchingalgorithm.binarysearch.searchfortarget.Matrix;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void testSearchTargetValue() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        assertTrue(Matrix.searchTargetValue(matrix, 3));  // Element present
        assertTrue(Matrix.searchTargetValue(matrix, 16)); // Element present
        assertTrue(Matrix.searchTargetValue(matrix, 60)); // Last element

        assertFalse(Matrix.searchTargetValue(matrix, 2));  // Element not present
        assertFalse(Matrix.searchTargetValue(matrix, 13)); // Element not present
        assertFalse(Matrix.searchTargetValue(matrix, 100));// Element not present

        System.out.println("All Test Cases Passed!");
    }
}
