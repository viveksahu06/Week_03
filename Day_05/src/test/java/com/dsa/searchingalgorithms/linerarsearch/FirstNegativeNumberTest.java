package com.dsa.searchingalgorithms.linerarsearch;
import com.dsa.searchingalgorithm.linearsearch.firstnegativenumber.FirstNegativeNumber;
import org.junit.Test;
import static org.junit.Assert.*;

public class FirstNegativeNumberTest {

    @Test
    public void testFirstNegativeNumber() {
        int[] arr1 = {1, 2, 3, -4, 5, -6};
        assertEquals(3, FirstNegativeNumber.firstNegativeNumber(arr1)); // First negative at index 3

        int[] arr2 = {-1, 2, 3, 4};
        assertEquals(0, FirstNegativeNumber.firstNegativeNumber(arr2)); // First negative at index 0

        int[] arr3 = {5, 10, 15, 20};
        assertEquals(-1, FirstNegativeNumber.firstNegativeNumber(arr3)); // No negative numbers

        int[] arr4 = {-10, -20, -30};
        assertEquals(0, FirstNegativeNumber.firstNegativeNumber(arr4)); // First negative at index 0

        int[] arr5 = {0, 1, -1};
        assertEquals(2, FirstNegativeNumber.firstNegativeNumber(arr5)); // First negative at index 2

        System.out.println("All Test Cases Passed!");
    }
}

