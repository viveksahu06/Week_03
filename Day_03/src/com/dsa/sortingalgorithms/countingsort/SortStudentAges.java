package com.dsa.sortingalgorithms.countingsort;

import java.util.Arrays;

public class SortStudentAges {
    public static void main(String[] args) {
        CountSort cs = new CountSort();
        int studentAges[]={3,2,6,5,4,7,8,5,4,1};
        cs.countSort(studentAges);

        System.out.println("Ages of the student in sorted form is: ");
        System.out.println(Arrays.toString(studentAges));
    }
}
