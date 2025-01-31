package com.dsa.sortingalgorithms.selectionsort;

import java.util.Arrays;

public class SortedExamScore {
    public static void main(String[] args) {
        SelectionSort selectionSort=new SelectionSort();
        int[] examScores = {85, 72, 90, 66, 78, 95, 88};
        System.out.println("Exam scores before sorting: " + Arrays.toString(examScores));

        //Method calling
        selectionSort.selectionSort(examScores);
        System.out.println("Exam scores after sorting: " + Arrays.toString(examScores));
    }
}
