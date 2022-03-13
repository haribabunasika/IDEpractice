package com;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = Arrays.asList(1,2,3,4,6,6,4).stream().collect(Collectors.toSet());;
        set.stream().distinct().forEach(System.out::println);
   

    }
}
