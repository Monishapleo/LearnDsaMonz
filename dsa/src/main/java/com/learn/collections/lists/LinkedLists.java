package com.learn.collections.lists;

import java.util.*;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> employees= new LinkedList<>();
        employees.add("Dev");
        employees.add("Tester");
        employees.add("Devops");
        employees.add("DUPE");
        employees.add("DUPE");
        employees.add(null);
        employees.add(null);
        System.out.println("Employees : "+employees);
        employees.addFirst("Hemanth");
        employees.addLast("HemanthRaj");

        System.out.println("After add first and last : "+employees);
        System.out.println("After get first  : "+employees.getFirst());
        System.out.println("After get last : "+employees.getLast());

        System.out.println("=================================================");
        Iterator<String> iterator = employees.descendingIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=================================================");
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Monisha");
        map.put(101, "Monz");
        System.out.println("MAP : "+map.size());

    }
}
