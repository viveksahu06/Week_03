package com.dsa.sortingalgorithms.mergesort;

import java.util.Arrays;

public class SortedBookPrice {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] bookPrices = {399, 299, 429, 569, 199, 49};
        System.out.println("Book prices before merge sort: " + Arrays.toString(bookPrices));

        //Method calling
        mergeSort.mergeSort(bookPrices, 0, bookPrices.length - 1);
        System.out.println("Book prices after merge sort: " + Arrays.toString(bookPrices));
    }
}
