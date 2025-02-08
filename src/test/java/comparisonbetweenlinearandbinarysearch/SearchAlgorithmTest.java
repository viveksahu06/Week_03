package comparisonbetweenlinearandbinarysearch;

import com.dsa.algortihms.runtimeanalysis.comparisonbetweenlinearandbinarysearch.BinarySearch;
import com.dsa.algortihms.runtimeanalysis.comparisonbetweenlinearandbinarysearch.LinearSearch;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SearchAlgorithmTest {
    @Test
    public void testLinearSearch_Found() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertTrue(LinearSearch.linearSearch(data, 5));
    }

    @Test
    public void testLinearSearch_NotFound() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertFalse(LinearSearch.linearSearch(data, 15));
    }

    @Test
    public void testBinarySearch_Found(){
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertTrue(BinarySearch.binarySearch(data,8));
    }
    @Test
    public void testBinarySearch_NotFound(){
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertFalse(BinarySearch.binarySearch(data,22));
    }
    @Test
    public void testBinarySearch_SingleElement() {
        int[] singleData = {5};
        assertTrue(BinarySearch.binarySearch(singleData, 5));
        assertFalse(BinarySearch.binarySearch(singleData, 10));
    }

    @Test
    public void testPerformance(){
        int size = 100000;
        int[] largeData = new int[size];
        for (int i = 0; i < size; i++) {
            largeData[i] = i;
        }
        int key = size / 2;

        long startTime = System.nanoTime();
        LinearSearch.linearSearch(largeData, key);
        long linearTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        BinarySearch.binarySearch(largeData, key);
        long binaryTime = System.nanoTime() - startTime;

        System.out.println("Linear Search Time: " + (linearTime / 1000000.0) + " ms");
        System.out.println("Binary Search Time: " + (binaryTime / 1000000.0) + " ms");

        assertTrue(binaryTime < linearTime);
    }
}
