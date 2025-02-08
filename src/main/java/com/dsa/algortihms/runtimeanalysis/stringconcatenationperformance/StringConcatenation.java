package com.dsa.algortihms.runtimeanalysis.stringconcatenationperformance;

public class StringConcatenation {
    //method to word concatenate with string
    public static void concatenateWithString(int size){
        //empty string
        String str="";
        for(int i=0; i<size; i++) {
            //creates a new object at every creation
            str += "v";
        }
    }
}
