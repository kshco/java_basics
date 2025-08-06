package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(22,34,56,7,8,9,12);

       Optional<Integer>  sums = number.stream().reduce((a, b)->a+b);
        System.out.println("Sum of numbers are "+ sums.get());
    }
}
