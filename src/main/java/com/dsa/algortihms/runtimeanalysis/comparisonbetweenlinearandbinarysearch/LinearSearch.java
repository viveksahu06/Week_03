package com.dsa.algortihms.runtimeanalysis.comparisonbetweenlinearandbinarysearch;

public class LinearSearch {
    //method to perform linear search
    public static boolean linearSearch(int arr[], int key){
        //length of the array
        int length= arr.length;
        //iterating over to match the key present or not
        for(int i=0;i<length;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
}
