package com.dsa.algortihms.runtimeanalysis.sortinglargedataefficiently;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

public class SortingAlgorithmsTest {
    @Test
    public void test_bubbleSort(){
        //dummy array to sort
        int []testArray={3,4,2,5,1,6,7,8,0,9};
        //final resultant answer of the dummy array
        int[] resultArray={0,1,2,3,4,5,6,7,8,9};
        //call bubble sort
        BubbleSort.bubbleSort(testArray,10);
        //compare both results
        assertArrayEquals(resultArray,testArray);
        System.out.println("Test Case passed!!");
    }

    @Test
    public void test_mergeSort(){
        //dummy array to sort
        int[] testArray={3,4,2,5,1,6,7,8,0,9};
        //final resultant answer of the dummy array
        int[] resultArray={0,1,2,3,4,5,6,7,8,9};
        //call merge sort
        MergeSort.mergeSort(testArray,0,9);
        //compare result
        assertArrayEquals(resultArray,testArray);
        System.out.println("Test Case passed!!");
    }

    @Test
    public void test_quickSort(){
        //dummy array to sort
        int[] testArray={3,4,2,5,1,6,7,8,0,9};
        //final resultant answer of the dummy array
        int[] resultArray={0,1,2,3,4,5,6,7,8,9};
        //call quick sort
        QuickSort.quickSort(testArray,0,9);
        assertArrayEquals(resultArray,testArray);
        System.out.println("Test Case passed!!");
    }

    @Test
    public void testPerformance(){
        Random random = new Random();
        int size =1000;
        int []dataArray = new int[size];

        for(int i =0 ; i<size; i++){
            dataArray[i]= random.nextInt(size);
        }

        // time duration for bubble sort
        long startTime= System.currentTimeMillis();
        BubbleSort.bubbleSort(dataArray.clone(), size);
        long totalTimeForBubbleSort = System.currentTimeMillis() - startTime;

        //time duration for merge sort
        startTime = System.currentTimeMillis();
        MergeSort.mergeSort(dataArray.clone(),0,size-1);
        long totalTImeForMergeSort = System.currentTimeMillis()-startTime;

        //time duration for quick sort
        startTime = System.currentTimeMillis();
        QuickSort.quickSort(dataArray.clone(), 0 , size-1);
        long totalTimeForQuickSort = System.currentTimeMillis()-startTime;

        //displaying the result
        System.out.println("DataSet Size: "+size);
        System.out.println("Bubble Sort Time: "+ totalTimeForBubbleSort+ " ms");
        System.out.println("Merge Sort Time: "+ totalTImeForMergeSort+ " ms");
        System.out.println("QuickSortTime: "+ totalTimeForQuickSort+ " ms");

    }
}
