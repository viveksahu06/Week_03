package com.dsa.algortihms.runtimeanalysis.searchcomparison;

import java.util.TreeSet;

public class TreeSetComparison {
    //method to search element at TreeSet
    public static boolean search(TreeSet<Integer> treeSet, int key) {
        return treeSet.contains(key);
    }
}