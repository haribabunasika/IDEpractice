package com;

import java.util.Arrays;
import java.util.List;


public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,6,6,4);
        list.stream().distinct().forEach(System.out::println);
        System.out.println("Remote changes from haribabu.nasika@gmail_dev");


    }
}
