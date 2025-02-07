//Search a Target in a Large Dataset
//Objective:
//Compare the performance of Linear Search (O(N)) and Binary Search (O(log N)) on different dataset sizes.
//Approach:
//Linear Search: Scan each element until the target is found.
//Binary Search: Sort the data first (O(N log N)), then perform O(log N) search.
//Comparative Analysis:
//Dataset Size (N)
//Linear Search (O(N))
//Binary Search (O(log N))
//        1,000
//        1ms
//0.01ms
//10,000
//        10ms
//0.02ms
//1,000,000
//        1s
//0.1ms
//
//Expected Result:
//Binary Search performs much better for large datasets, provided data is sorted.

package com.dsa.algortihms.runtimeanalysis;

public class SearchATargetInLargeDataSet {
}
