package com.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class StringToUpperAndLowerCase {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Red", "Blue", "Pink", "Yellow");

        System.out.println("\nOriginal strings:");
        for (String str : stringList) {
            System.out.println(str);
        }

        stringList.replaceAll(str -> str.toLowerCase());

        System.out.println("\nLowercase strings:");
        for (String str : stringList) {
            System.out.println(str);
        }

        stringList.replaceAll(str -> str.toUpperCase());

        System.out.println("\nUppercase strings:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }

    /*
    In the above exercise, we start by creating a list of strings stringList.

    The replaceAll() method applies a lambda expression that converts each string
    in the list to uppercase using the toUpperCase() method. This lambda expression
    is (str -> str.toUpperCase()). After that, the replaceAll() method applies a
    lambda expression that converts each string in the list to lowercase using the
    toLowerCase method. This lambda expression is (str -> str.toLowerCase()).
    */
}
