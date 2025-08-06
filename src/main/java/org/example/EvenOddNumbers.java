package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 4, 3, 8, 7, 23, 56);

        // even numbers
       List<Integer> evenNums = nums.stream().filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("even numbers are " + evenNums);

        //odd numbers

        List<Integer> oddNums = nums.stream().filter(a->a%2!=0).collect(Collectors.toList());
        System.out.println("odd numbers are "+ oddNums);
    }
}
