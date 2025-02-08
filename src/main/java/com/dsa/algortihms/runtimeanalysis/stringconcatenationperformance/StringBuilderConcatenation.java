package com.dsa.algortihms.runtimeanalysis.stringconcatenationperformance;

public class StringBuilderConcatenation {
    //method to word concatenate with StringBuilder
    public static void concatenateWithStringBuilder(int size){
        //empty string
        StringBuilder sbr = new StringBuilder();
        for(int i=0; i<size; i++) {
            sbr.append("v");
        }
    }
}
