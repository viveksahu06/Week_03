//5. Selection Sort - Sort Exam Scores
//Problem Statement:
//A university needs to sort students’ exam scores in ascending order. Implement Selection Sort to achieve this.
//Hint:
//Find the minimum element in the array.
//Swap it with the first unsorted element.
//Repeat the process for the remaining elements.
package com.dsa.sortingalgorithms.selectionsort;
import java.util.Arrays;
public class SelectionSort {
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            //Finding the index
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            //Swapping
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }
}
