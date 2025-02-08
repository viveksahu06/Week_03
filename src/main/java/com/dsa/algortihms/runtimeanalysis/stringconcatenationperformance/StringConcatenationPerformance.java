//3. Problem Statement: String Concatenation Performance
//Objective:
//Compare the performance of String (O(N²)), StringBuilder (O(N)), and StringBuffer (O(N)) when concatenating a
// million strings.
// Approach:
//Using String (Immutable, creates new object each time)
//Using StringBuilder (Fast, mutable, thread-unsafe)
//Using StringBuffer (Thread-safe, slightly slower than StringBuilder)
//Comparative Analysis:
//Operations Count (N)
//String (O(N²))
//StringBuilder (O(N))
//StringBuffer (O(N))

//Expected Result:
//StringBuilder & StringBuffer are much more efficient than String.
//Use StringBuilder for single-threaded operations and StringBuffer for multi-threaded.
package com.dsa.algortihms.runtimeanalysis.stringconcatenationperformance;

public class StringConcatenationPerformance {
    public static void main(String[] args) {
        //declaring different size array
        int sizes[]={1000, 10000, 1000000};
        //iterate over size array for different sizes
        for(int size : sizes){
            System.out.println("DataSet Size: "+size);

            //Total time for String Concatenation
            long startTime = System.currentTimeMillis();
            //method call for String concat
            StringConcatenation.concatenateWithString(size);
            long endTime = System.currentTimeMillis();
            System.out.println("String ConcatenationTime: " + (endTime - startTime) + " ms");



            //Total time for StringBuilder Concatenation
            startTime = System.currentTimeMillis();
            //method call for StringBuilder concat
            StringBuilderConcatenation.concatenateWithStringBuilder(size);
            endTime = System.currentTimeMillis();
            System.out.println("StringBuilder ConcatenationTime: " + (endTime - startTime) + " ms");



            //Total time for StringBuffer Concatenation
            startTime = System.currentTimeMillis();
            //method call for StringBuffer concat
            StringBufferConcatenation.concatenateWithString(size);
            endTime = System.currentTimeMillis();
            System.out.println("StringBuffer ConcatenationTime: " + (endTime - startTime) + " ms");
            System.out.println("********************************************************");

        }
    }

}
