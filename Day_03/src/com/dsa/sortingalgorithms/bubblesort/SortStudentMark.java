package com.dsa.sortingalgorithms.bubblesort;

import java.util.Arrays;

public class SortStudentMark {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        //Student marks stored in array
        int [] studentMarks = {53,100,91,82,74};
        System.out.println("Student Marks Before Sorting: " + Arrays.toString(studentMarks));

        //Calling method
        bubbleSort.bubbleSort(studentMarks);
        System.out.println("Student Marks After Sorting: " + Arrays.toString(studentMarks));
    }
}
