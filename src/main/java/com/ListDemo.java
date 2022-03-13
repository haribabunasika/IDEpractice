package com;

import java.util.Arrays;
import java.util.List;


public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,6,6,4);
        list.stream().distinct().forEach(System.out::println);
        //The below line is commented.
        //System.out.println("Remote changes from haribabu.java4s@gmail_dev");

        System.out.println("Remote  and changes from haribabu.nasika@gmail_dev");

        System.out.println("Local changes from haribabu.nasika@gmail_dev");
       /* List<String> numbers = Arrays.asList("one", "two", "one", "two", "three", "four");
        Map<String, Long> wordsLength = numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        // tomap() examples
        Map<String, Integer> wordsLength1 = numbers.stream().collect(Collectors.toMap(Function.identity(), String::length));*/


    }
}
