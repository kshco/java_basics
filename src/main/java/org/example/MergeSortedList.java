package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeSortedList {

    // merge two sorted list into single sorted list using stream api

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 4, 6);
        List<Integer> list2 = Arrays.asList(1,3,7);

        List<Integer>finalMergeList = Stream.concat(list1.stream(),list2.stream())
                .sorted().toList();
        finalMergeList.forEach(System.out::println);

    }
}
