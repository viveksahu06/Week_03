package com.dsa.sortingalgorithms.quicksort;

import java.util.Arrays;

public class SortedProductPrice {
    public static void main(String[] args) {
        QuickSort quickSort=new QuickSort();
        int[] productPrices = {599, 299, 429, 569, 199, 49};
        System.out.println("Product price before sorting - " +Arrays.toString(productPrices));

        //Method calling
        quickSort.quickSort(productPrices, 0, productPrices.length - 1);
        System.out.println("Product price after sorting - " + Arrays.toString(productPrices));
    }
}
