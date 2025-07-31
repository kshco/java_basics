package org.example;

import java.util.Arrays;
import java.util.List;

public class StringStartingWithDigit {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1apple","banama","grapes","2orange");

        list.stream().filter(str->!str.isEmpty() && Character.isDigit(str.charAt(0)))
                .forEach(System.out::println);

    }

}
