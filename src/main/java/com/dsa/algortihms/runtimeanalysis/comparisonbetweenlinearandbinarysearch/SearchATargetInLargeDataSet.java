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

package com.dsa.algortihms.runtimeanalysis.comparisonbetweenlinearandbinarysearch;
import java.util.Random;

public class SearchATargetInLargeDataSet {
    public static void main(String[] args) {
        //size array as per requirement
        int size[]={1000,10000,100000};
        Random random = new Random();
        //for different cases
        for(int i=0;i< size.length ;i++){
            int dataArray[]= new int[size[i]];
            //fill the data
            for(int k=0;k<size[i];k++){
                dataArray[k]=k;
            }
            //generate random key for searching
            int key= random.nextInt(size[i]);

            //for linear search time
            long startingTime= System.nanoTime();
            boolean result= LinearSearch.linearSearch(dataArray,key);
            long linearTime = System.nanoTime() - startingTime;


            //for binarySearch
            startingTime= System.nanoTime();
            result= LinearSearch.linearSearch(dataArray,key);
            long binaryTime = System.nanoTime() - startingTime;

            //displaying the result
            System.out.println("DataSet Size: "+size[i]);
            System.out.println("Linear Search Time: "+ linearTime/1000000.0 + " s");
            System.out.println("Binary Search Time: "+ binaryTime/1000000.0 + " s");
            System.out.println("********************************************************");

        }

    }
}
