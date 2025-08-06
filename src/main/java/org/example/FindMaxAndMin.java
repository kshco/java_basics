package org.example;

import java.util.Comparator;
import java.util.List;

public class FindMaxAndMin {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,4,5,78,1,0);

        int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max number = " +max);

        int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min number = " +min);
    }
}
