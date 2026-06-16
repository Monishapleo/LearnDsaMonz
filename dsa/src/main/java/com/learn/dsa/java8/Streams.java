package com.learn.dsa.java8;

import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Integer> l = List.of(1,2,3,4,5);

        l.forEach(System.out::println);
        l.stream().filter(n->n%2==0).forEach(System.out::println);

        //lambda syntax (parameters) -> body
        Runnable r = () -> System.out.println("HELLO");

        r.run();

        List<Integer> list = List.of(1,2,3,4,5);

        list.stream()
                .filter(n -> n > 2)
                .map(n -> n * 10)
                .forEach(System.out::println);
    }
}
