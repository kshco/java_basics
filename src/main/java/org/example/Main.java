package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"RAM");
        map.put(102,"Shashi");
        map.put(103,"Khushbu");
        System.out.println(map);
        String s = map.get(102);
        System.out.println(s);
        String s1 = map.get(105);
        System.out.println(s1);

        System.out.println( map.containsValue("Shashi"));
            for(int i :map.keySet())
                System.out.println(map.get(i));
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer,String> entry:entries){
            System.out.println();
        }


    }
}