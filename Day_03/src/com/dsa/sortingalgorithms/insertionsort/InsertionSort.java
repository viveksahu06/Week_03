//2. Insertion Sort - Sort Employee IDs
//Problem Statement:
//A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs in ascending order.
//Hint:
//Divide the array into sorted and unsorted parts.
//Pick an element from the unsorted part and insert it into its correct position in the sorted part.
//Repeat for all elements.
package com.dsa.sortingalgorithms.insertionsort;
import java.util.Arrays;

public class InsertionSort {
    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int previous = i - 1;

            //Finding correct position to insert
            while (arr[previous] >= 0 && arr[previous] > current) {
                arr[previous + 1] = arr[previous];
                previous--;
            }

            //Insertion
            arr[previous + 1] = current;
        }
        return arr;
    }
}