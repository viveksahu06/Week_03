package com.dsa.algortihms.runtimeanalysis.stringconcatenationperformance;

public class StringBufferConcatenation {
    //method to word concatenate with StringBuffer
    public static void concatenateWithString(int size){
        //empty string
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<size; i++) {
            sb.append("v");
        }
    }
}
