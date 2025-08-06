package org.example;
import java.sql.SQLOutput;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {

       // find duplicate numbers

        List<Integer> list = List.of(1,2,3,5,4,2,23,45,23,65,5,67);
//        Set<Integer> duplicates = list.stream()
//            .filter(e-> Collections.frequency(list,e)>1)
//                .collect(Collectors.toSet());
//       System.out.println(duplicates); // [2, 5, 23]


        // another way
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> dupNum =list.stream().filter(e->!duplicates.add(e)).collect(Collectors.toSet());
        System.out.println(dupNum);



    }
}
