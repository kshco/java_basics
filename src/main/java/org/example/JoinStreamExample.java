package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JoinStreamExample {

    //join two Stream

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2,4,6,7);
        List<Integer>list2 = Arrays.asList(8,6,7);

        Stream<Integer>combineStream = Stream.concat(list1.stream(),list2.stream());
        combineStream.forEach(System.out::println);


    }
}
