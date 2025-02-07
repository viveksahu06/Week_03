package com.dsa.algortihms.runtimeanalysis.comparisonbetweenlinearandbinarysearch;

public class BinarySearch {
    //method to perform binary search
    public static boolean binarySearch(int []arr , int key){
        int lft=0;
        int rht=arr.length-1;
        //iterate through two pointer
        while(lft<=rht){
            //find mid element
            int mid= lft+ (rht-lft)/2;
            //compare if found true otherwise continue
            if(arr[mid]==key){
                return true;
            }
            if(arr[mid]>key){
                rht= mid-1;
            }
            else{
                lft = mid+1;
            }
        }
        return false;
    }
}
