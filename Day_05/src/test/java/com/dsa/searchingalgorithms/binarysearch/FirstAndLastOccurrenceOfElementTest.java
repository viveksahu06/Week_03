package com.dsa.searchingalgorithms.binarysearch;


import com.dsa.searchingalgorithm.binarysearch.firstandlastoccurrenceofelement.FirstAndLastOccurrenceOfElementInSortedArray;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class FirstAndLastOccurrenceOfElementTest {  // Renamed for best practice

    @Test
    public void testFindOccurrence() {


        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int[] expected = {1, 3};

        assertArrayEquals(expected, FirstAndLastOccurrenceOfElementInSortedArray.firstAndLastOccurrenceOfElement(arr, target));
        System.out.println("Test Case Passed");
    }
}
