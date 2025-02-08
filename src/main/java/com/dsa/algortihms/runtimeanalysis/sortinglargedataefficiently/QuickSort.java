package com.dsa.algortihms.runtimeanalysis.sortinglargedataefficiently;

public class QuickSort {
    //method to perform quick sort
    public static void quickSort(int []arr, int low, int high){
        if(low<high){
            //find the pivot element of the array
            int pi = partition(arr,low,high);
            //quick sort for before pivot element
            quickSort(arr,low,pi-1);
            //quick sort for after pivot element
            quickSort(arr,pi+1,high);
        }
    }
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        //to check condition for next element
        for(int j=low; j<high ; j++){
            if(arr[j]<pivot){
                i++;
                //swap the max element
                int temp =arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        //swap the element
        int temp =arr[i+1];
        arr[i+1]=arr[high];
        arr[high] = temp;

        return i+1;
    }
}
