//1. Bubble Sort - Sort Student Marks
//        Problem Statement:
//        A school maintains student marks in an array. Implement Bubble Sort to sort the student marks in ascending order.
//        Hint:
//        Traverse through the array multiple times.
//        Compare adjacent elements and swap if needed.
//        Repeat the process until no swaps are required.
package com.dsa.sortingalgorithms.bubblesort;

public class BubbleSort {
    public int[] bubbleSort(int[] studentMarks) {
        //loop 1 = turn
        for(int i = 0; i < studentMarks.length - 1; i++) {
            boolean swapped = false;
            //loop 2 = element
            for(int j = 0; j < studentMarks.length - i - 1; j++) {
                if (studentMarks[j] > studentMarks[j + 1]) {
                    //swap
                    studentMarks[j] = studentMarks[j] ^ studentMarks [j + 1];
                    studentMarks[j + 1] = studentMarks[j] ^ studentMarks[j + 1];
                    studentMarks[j] = studentMarks[j] ^ studentMarks[j + 1];

                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
        //return statement
        return studentMarks;
    }
}
