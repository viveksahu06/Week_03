package com.dsa.algortihms.runtimeanalysis.sortinglargedataefficiently;

public class BubbleSort {
    //method to swap two variables
    public static void swap(int arr[], int i, int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
    //method to perform bubble sort
    public static void bubbleSort(int arr[], int size){

        for(int i=0;i<size-1;i++){
            boolean flag =false;
            for(int j=0 ; j<size-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag= true;
                }
            }
            //to enhance the performance of bubble sort
            if(!flag){
                break;
            }
        }
    }
}
