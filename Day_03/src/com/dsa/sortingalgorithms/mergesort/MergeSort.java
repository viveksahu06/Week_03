package com.dsa.sortingalgorithms.mergesort;
import java.util.Arrays;

public class MergeSort {
    public void mergeSort(int[] bookPrices, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            // Left half
            mergeSort(bookPrices, left, middle);
            // Right half
            mergeSort(bookPrices, middle + 1, right);
            // Merging when sorted
            merge(bookPrices, left, middle, right);
        }
    }

    public static void merge(int[] bookPrices, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copying elements to temporary arrays
        for (int i = 0; i < n1; i++)
            leftArr[i] = bookPrices[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = bookPrices[middle + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge the sorted arrays back into bookPrices
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                bookPrices[k] = leftArr[i];
                i++;
            } else {
                bookPrices[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copying remaining elements, if any
        while (i < n1) {
            bookPrices[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            bookPrices[k] = rightArr[j];
            j++;
            k++;
        }
    }
}