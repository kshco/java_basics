package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PrimeCheck {

    //check the given list contains prime number using stream
    // prime number are divisible by 1 or itself

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 7, 9, 11, 12, 13);

       Stream<Integer> primeNumber =  list.stream().filter(PrimeCheck::isPrime);
        System.out.println(primeNumber);
    }

    public static boolean isPrime(int num) {
        if (num > 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

