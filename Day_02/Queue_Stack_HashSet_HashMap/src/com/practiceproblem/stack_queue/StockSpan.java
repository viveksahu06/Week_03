//Stock Span Problem
//Problem: For each day in a stock price array, calculate the span (number of consecutive days the price was
// less than or equal to the current day's price).
//        Hint: Use a stack to keep track of indices of prices in descending order.
//
package com.practiceproblem.stack_queue;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static int [] stockSpain(int []stockArray){
        Stack<Integer> stack =new Stack<>();
        int resultSpan[]= new int[stockArray.length];
        for(int i=0 ; i<stockArray.length ; i++){
            while(!stack.isEmpty() && stockArray[stack.peek()]<= stockArray[i]){
                stack.pop();
            }
            resultSpan[i]=(stack.isEmpty())?i+1 : i-stack.peek();
            stack.push(i);
        }

        return resultSpan;
    }
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] result = stockSpain(prices);

        System.out.println("Stock Spans: " + Arrays.toString(result));

    }

}
