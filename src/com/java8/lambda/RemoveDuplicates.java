package com.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 3, 4, 3, 2, 5, 6, 1, 7, 7, 8, 10);

        System.out.println("List elements " + nums);

        List<Integer> unique_nums = new ArrayList<>();

        nums.stream()
                .distinct()
                .forEach(n -> unique_nums.add(n));

        System.out.println("\nList elements without duplicates: " + unique_nums);
    }

    /*
     In the above exercise we use the stream() method on the nums list to convert
     it into a stream. We call the distinct() method to filter out duplicate elements.
     The distinct() method ensures that only distinct elements are retained in the stream.

     Finally, we use the forEach() method and a lambda expression unique_nums::add to
     add each unique element to the unique_nums list.
    * */
}
