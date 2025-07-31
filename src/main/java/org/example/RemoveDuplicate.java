package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    //remove the duplicate and preserve the order

    public static void main(String[] args) {
         List<String> list = Arrays.asList("apple","banana", "apple","orange","banana");
//         list.stream().distinct().forEach(System.out::println);

// another way to  remove duplicate
         list.stream().collect(Collectors.toSet()).forEach(System.out::println);
    }
}
