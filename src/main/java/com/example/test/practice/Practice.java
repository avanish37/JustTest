package com.example.test.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) {

/*        List<String> result = Stream.of("a", "b", "c", "d")
                .gather(s -> s.toUpperCase())
                .toList();
        System.out.println(result);*/

        ///println("Hello");

        List<Integer> integers = Arrays.asList(1, 3, 2, 5, 6, 7);
        Stream<Integer> integerStream = Stream.of(1, 9, 3, 2, 0, 5, 7);

        Stream<Integer> sorted = integers.stream().sorted(Comparator.naturalOrder());
        sorted.forEach(System.out::println);
        System.out.println("---------------");
        integerStream.sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }


}
