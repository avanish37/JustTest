package com.example.test.practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacterCounter {
    public static void main(String[] args) {
        String input = "programming";

        // Count the frequency of each character
        Map<Character, Long> charCountMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Filter and display only duplicate characters
        System.out.println("Duplicate characters and their counts:");
        charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Keep only duplicates
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}


/*
Explanation:
        input.chars():

        Converts the string into a stream of int values representing each character's Unicode code point.
        .mapToObj(c -> (char) c):

        Maps each int code point to its corresponding char.
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())):

        Groups the characters by their identity (the character itself) and counts their occurrences.
        .filter(entry -> entry.getValue() > 1):

        Filters out characters that appear only once.
        .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue())):

        Prints the duplicate characters along with their counts.
        Example Output:
        For the input "programming", the output will be:

        Code
        Duplicate characters and their counts:
        r: 2
        g: 2
        m: 2

 */
