package com.dsa.sortingalgorithms.insertionsort;

import java.util.Arrays;

public class SortEmployeeId {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        //Employee id
        int[] employeeId = {101,104,103,102};
        System.out.println("Employee id before sorting - "+Arrays.toString(employeeId));

        //Calling method
        insertionSort.insertionSort(employeeId);
        System.out.println("Employee id after sorting - "+ Arrays.toString(employeeId));
    }
}
