//Sort Job Applicants by Salary
//Problem Statement:
//A company receives job applications with different expected salary demands. Implement Heap Sort to sort these
// salary demands in ascending order.
//        Hint:
//Build a Max Heap from the array.
//Extract the largest element (root) and place it at the end.
//Reheapify the remaining elements and repeat until sorted.

package com.dsa.sortingalgorithms.heapsort;

import java.util.Arrays;
import java.util.HashMap;

public class SortJobApplicantBySalary {
    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int salary[]={2000,500000,4654,8234,61234,7234,23451,52345,2234342,344510};
        heapSort.heapSort(salary, salary.length);
        System.out.println("Salary of the employee is in ascending order: ");
        System.out.println(Arrays.toString(salary));
    }
}
