package com.dsa.sortingalgorithms.heapsort;

public class HeapSort {
    public void heapSort(int arr[], int n){

        for(int i = n/2 -1; i>=0 ;i--) {
            heapify(arr, n, i);
        }

        for(int i= n-1 ; i>=0 ;i--){
            int temp =arr[0];
            arr[0] =arr[i];
            arr[i]= temp;
            heapify(arr, i , 0);
        }

    }

    static void heapify(int arr[], int n  , int idx){

        int largest = idx;
        int lft = 2*idx+1;
        int rht = 2*idx+2;

        if(lft<n&& arr[lft]>arr[largest]){
            largest = lft;
        }
        if(rht<n && arr[rht]>arr[largest]){
            largest = rht;
        }

        if(largest != idx){
            int temp= arr[largest];
            arr[largest]=arr[idx];
            arr[idx]=temp;

            heapify(arr,n , largest);
        }

    }
}
