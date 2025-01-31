package com.dsa.sortingalgorithms.countingsort;

public class CountSort {
    public void countSort(int []ages){
        if(ages == null || ages.length <=1){
            return;
        }
        int max = ages[0];

        for(int num : ages){
            if(num >max){
                max= num;
            }
        }


        int []countArray = new int[max+1];

        for(int num :ages){
            countArray[num]++;
        }

        int index=0;

        for(int i=0; i<=max; i++){
            while(countArray[i]>0){
                ages[index]= i;
                index++;
                countArray[i]--;
            }
        }
    }
}
