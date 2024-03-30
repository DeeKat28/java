package com.java8.lambda;

public class SumOfTwoIntegers {
    public static void main(String[] args) {
        SumCalculator sumCalculator = (a, b) -> a + b;
        int result = sumCalculator.sum(7, 6);
        System.out.println(result);
    }
}

interface SumCalculator {
    int sum(int a, int b);
}

/* In the above exercise, a functional interface named SumCalculator is defined.
This interface has a single abstract method called sum that takes two integer parameters
and returns an integer result. The lambda expression (x, y) -> x + y is used to implement
this method. It takes two integers, x and y, and returns their sum.

In the main method, an instance of the SumCalculator interface is created using
the lambda expression and assigned to the variable sumCalculator. For calculating
the sum, the sumCalculator is invoked with pairs of integer arguments.
System.out.println prints the results to the console from the result variable.*/
