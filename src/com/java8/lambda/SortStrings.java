package com.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class SortStrings {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "green", "blue", "black", "pink");

        System.out.println("Original strings:");
        for (String str : colors) {
            System.out.print(str + ' ');
        }

        colors.sort((str1, str2) -> str1.compareToIgnoreCase(str2));

        System.out.println("\nSorted strings:");
        for (String str : colors) {
            System.out.print(str + ' ');
        }
    }

    /*
    First create a list of strings called colors using the Arrays.asList() method
    and print the original list elements.

    To sort the strings list alphabetically, we use the sort method on the colors list.
    The lambda expression (str1, str2) -> str1.compareToIgnoreCase(str2) is used as a
    comparator. It compares two strings lexicographically, ignoring the case, using the
    compareToIgnoreCase method.

    After sorting the list, we print the sorted list of strings.
    * */
}
