package org.example;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {

    //find all the numbers starting with 1 using streams

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 21, 13, 44, 1, 57,89);

       List<Integer> numberStartWithOne = list.stream().
               filter(num->String.valueOf(num).
                       startsWith("1")).toList();

       numberStartWithOne.forEach(System.out::println);
//       System.out.println(numberStartWithOne);
    }
}
