package com.example.test.practice;

import java.util.Arrays;

public class ThirdLargestNumberFinder {
    public static void main(String[] args) {
        Integer[] numbers = {4, 2, 9, 5, 7, 3, 8}; // Example array

        // Sort the array in reverse order and find the 3rd largest number
        Integer thirdLargest = Arrays.stream(numbers)
                .sorted((a, b) -> b - a) // Sort in descending order
                .skip(2) // Skip the first two largest numbers
                .findFirst() // Get the third largest number
                .orElse(null); // Return null if the array has fewer than 3 elements

        if (thirdLargest != null) {
            System.out.println("The 3rd largest number is: " + thirdLargest);
        } else {
            System.out.println("The array has fewer than 3 elements.");
        }
    }
}

/*
Explanation:
        Arrays.stream(numbers):

        Converts the array into a stream of integers.
        .sorted((a, b) -> b - a):

        Sorts the integers in descending order using a custom comparator.
        .skip(2):

        Skips the first two largest numbers in the sorted stream.
        .findFirst():

        Retrieves the first element in the remaining stream (the 3rd largest).
        .orElse(null):

        Handles cases where the array has fewer than 3 elements by returning null.
        Example Output:
        For the input array {4, 2, 9, 5, 7, 3, 8}, the output will be:

        Code
        The 3rd largest number is: 7
*/
