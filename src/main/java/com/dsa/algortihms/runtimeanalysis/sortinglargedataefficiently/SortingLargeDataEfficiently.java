//Problem Statement: Sorting Large Data Efficiently
//Objective:
//Compare sorting algorithms Bubble Sort (O(N²)), Merge Sort (O(N log N)), and Quick Sort (O(N log N)).
//Approach:
//Bubble Sort: Repeated swapping (inefficient for large data).
//Merge Sort: Divide & Conquer approach (stable).
//Quick Sort: Partition-based approach (fast but unstable).
//Comparative Analysis:
//Dataset Size (N)
//Bubble Sort (O(N²))
//Merge Sort (O(N log N))
//Quick Sort (O(N log N))
//Expected Result:
//Bubble Sort is impractical for large datasets.
//Merge Sort & Quick Sort perform well.
package com.dsa.algortihms.runtimeanalysis.sortinglargedataefficiently;

import java.util.Random;

public class SortingLargeDataEfficiently {
    public static void main(String[] args) {
        int sizes[]= {1000, 10000, 100000};
        Random random = new Random();
        for(int size : sizes){
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
            System.out.println("********************************************************");

        }
    }

}
