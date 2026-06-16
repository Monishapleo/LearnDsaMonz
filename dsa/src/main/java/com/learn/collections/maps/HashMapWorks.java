package com.learn.collections.maps;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class HashMapWorks {
    public static void main(String[] args) {

        HashMap<Integer,String> employees =
                new HashMap<>();

        employees.put(101,"Monisha");
        employees.put(102,"Vipin");
        employees.put(103,"Manu");

        System.out.println(employees.hashCode());

        System.out.println(employees.get(101));
        employees.put(101,"New Monisha");

        System.out.println(employees);
        System.out.println(employees.containsKey(102));
        employees.put(null,"CEO");
        employees.put(null,"CTO");

        System.out.println(employees);
        /*employees.put(201,null);
        employees.put(202,null);
        employees.put(203,null);*/
        System.out.println(employees.containsValue("Manu"));

        //employees.remove(103);

        Set<Integer> keys = employees.keySet();

        keys.remove(101);


        System.out.println(employees);
        //System.out.println(employees.keySet());
    }
}
