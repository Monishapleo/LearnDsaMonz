package com.learn.streamz;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> nums =
                Arrays.asList(
                        12, 7, 18, 25, 30, 11, 42
                );
        nums.stream().map(n->n=+n);
                Boolean b=nums.stream().anyMatch(n->n%2==0);
        System.out.println("Boolean : "+b);
        // nums.stream().filter(n->n%2==0).map(n->n*10).forEach(System.out::println);
        Stream<Integer>streams= nums.stream().filter(n->n%2==0).map(n->n*10);
        System.out.println(streams.toList());

        List<String> names =
                Arrays.asList(
                        "Monisha",
                        "Ram",
                        "Manu",
                        "Abi",
                        "Mohan"
                );

        //List<String> lists = names.stream().filter(name -> name.startsWith("M")).map(name->name.toUpperCase()).toList();
        Optional<String> listsss = names.stream().filter(name -> name.startsWith("M")).findFirst();
        List<Integer> lists = names.stream().map(n->n.length()).toList();
        System.out.println("name len:"+lists);
        List<Integer> numss =
                Arrays.asList(
                        10,20,20,30,40,40,50
                );
        boolean c=names.stream().noneMatch(n->n.startsWith("Z"));
        System.out.println("match: "+c);
        //List<Integer> list = numss.stream().distinct().sorted().toList();
        long count = numss.stream().filter(n->n%2==0).count();
        System.out.println("lll: "+count);

        Optional<Integer> min = numss.stream().min(Integer::compareTo);
        Optional<Integer> max1= numss.stream().max((x,y)->x.compareTo(y));

        long count1= names.stream().filter(n -> n.startsWith("M")).count();
         names.stream().map(n->n+"@gmail.com").toList();

        List<String> sorts =
                Arrays.asList(
                        "Monisha",
                        "Ram",
                        "Manu",
                        "Abi",
                        "Mohan"
                );

        names.stream().filter(n -> n.startsWith("M")).map(n->n.toUpperCase()).sorted().toList();

/*
1. Remove duplicates
2. Keep only numbers greater than 20
3. Multiply each by 2
4. Sort the result
 */

        numss.stream().distinct().filter(n->n%2==0).filter(n->n>10).map(n->String.valueOf(n)).toList();

        /*
        1. Remove duplicates
2. Keep only names starting with M
3. Convert to lowercase
4. Sort them
5. Return as List<String>
         */

        names.stream().distinct().filter(n->n.startsWith("M")).map(n ->n.toLowerCase()).sorted().toList();

        names.stream().allMatch(n-> n.length()>2);
        names.stream().collect(Collectors.joining(","));
        nums.stream()
                .collect(
                        Collectors.partitioningBy( n->n%2==0)
     );


        names.stream().filter(n->n.length()>3).count();

        names.stream().anyMatch(n->n.startsWith("M"));
        nums.stream().distinct().findFirst();
        names.stream().collect(Collectors.toMap(n->n,n->n.toUpperCase()));
        names.stream().collect(Collectors.groupingBy(n->n.length()));
        names.stream().collect(Collectors.joining("-"));
        names.stream().collect(Collectors.partitioningBy(n->n.length()>4));

        nums.stream().allMatch(n->n>5);
        /*
        1. Remove duplicates
2. Keep only names starting with M
3. Convert to uppercase
4. Sort them
5. Collect as List
         */

        names.stream().distinct().filter(n->n.startsWith("M")).map(n->n.toUpperCase()).sorted().toList();
        Set<Integer> set = new HashSet<>();
        Set<Integer> dupeSet = new HashSet<>();
        numss.stream().filter(n->!set.add(n)).map(n->dupeSet.add(n));
    }
}
