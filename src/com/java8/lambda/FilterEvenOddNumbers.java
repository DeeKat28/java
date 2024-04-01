package com.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);

        // Print the original numbers
        System.out.println("Original numbers:");
        for (int n : numbers) {
            System.out.print(n+ " ");
        }

        List<Integer> evenNumbers = numbers.stream()
                                        .filter(n -> n % 2 == 0)
                                        .collect(Collectors.toList());

        System.out.print("\nEven numbers:");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }

        List<Integer> oddNumbers = numbers.stream()
                                        .filter(n -> n % 2 != 0)
                                        .collect(Collectors.toList());

        System.out.print("\nOdd numbers:");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
    }

    /*
    At first create a list of integers called nums using the Arrays.asList() method and
    print the original list.

    To filter out even numbers, we use the stream() method on the list nums to convert it
    into a stream. Now apply a lambda expression with the filter() method. The lambda
    expression (n -> n % 2 == 0) checks if a number is divisible by 2 (i.e., even).
    We collect the filtered even numbers into a new list using the collect() method with
    Collectors.toList().

    To filter out odd numbers, we use a similar approach. We again use the stream()
    method on the nums list, apply a lambda expression (num -> num % 2 != 0) to check
    if a number is not divisible by 2 (i.e., odd), and collect the filtered odd numbers
    into a new list using collect() and Collectors.toList().
    * */
}
