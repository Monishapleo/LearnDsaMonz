package com.learn.collections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Monisha");
        arrayList.add("Vipin");
        arrayList.add("Manu");
        arrayList.add("Priya");
        arrayList.add("Shivam");
        arrayList.add("Swetha");
        arrayList.add("Aish");
        arrayList.add("Arun");
        arrayList.add("Keerthana");
        arrayList.add("Vicky");

        System.out.println("List contains : "+arrayList);

        arrayList.add(3,"Adding an element at index 3");
        System.out.println("After adding an element at index 3 : "+arrayList);

        arrayList.set(5,"Replacing index 5");
        System.out.println("After replacing index 5 : "+arrayList);
        arrayList.remove(2);
        System.out.println("After removing emp at index 2 : "+arrayList);
        boolean isTrue = arrayList.contains("Monisha");
        System.out.println("Is monisha exists : "+isTrue);
        arrayList.add(null);
        arrayList.add(null);

        System.out.println(arrayList);
        Iterator iterator = arrayList.listIterator();



    }
 }
