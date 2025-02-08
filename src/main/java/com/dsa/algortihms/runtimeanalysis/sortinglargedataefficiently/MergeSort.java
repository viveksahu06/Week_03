package com.dsa.algortihms.runtimeanalysis.sortinglargedataefficiently;

public class MergeSort {
    //method to perform merge sort
    public static void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            //mid point
            int mid = start + (end - start) / 2;
            //recursion to divide left part
            mergeSort(arr, start, mid);
            //recursion to dive right part
            mergeSort(arr, mid + 1, end);
            //merging the element
            merge(arr, start, mid, end);
        }
    }
    //method to merge the two sorted array
    public static void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int lft = start;
        int rht = mid + 1;
        int idx = 0;

        // Merge both halves into temp[]
        while(lft <= mid && rht <= end) {
            if(arr[lft] < arr[rht]) {
                temp[idx++] = arr[lft++];
            } else {
                temp[idx++] = arr[rht++];
            }
        }

        // Copy remaining elements from left half
        while(lft <= mid) {
            temp[idx++] = arr[lft++];
        }

        // Copy remaining elements from right half
        while(rht <= end) {
            temp[idx++] = arr[rht++];
        }

        // Copy sorted elements back to original array
        for(int i = 0; i < temp.length; i++) {
            arr[start + i] = temp[i];
        }
    }
}
