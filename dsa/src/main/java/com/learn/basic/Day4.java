package com.learn.basic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Day4 {
    public static void main(String[] args) {
        int[] arr = {7,3,5,3,7};

        //frequencyCount(arr);
        //System.out.println(firstNonRepeatingElement(arr));
        //System.out.println(maximumFrequencyElement(arr));
        System.out.println(firstRepeatingElement(arr));
    }

    public static void frequencyCount(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
          map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }
    public static int firstNonRepeatingElement(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int i : arr){
            if(map.get(i)==1){
                return i;
            }
        }
        return -1;
    }
    public static int maximumFrequencyElementMap(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxFreq=0;
        int answer = -1;
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                answer = entry.getKey();
            }
        }
            return answer;
    }
    public static int maximumFrequencyElement(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxFreq=0;
        int key=-1;
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : arr){
            if(map.get(i)>maxFreq){
                maxFreq=map.get(i);
                key=i;
            }
        }
            return key;
    }

    public static int firstRepeatingElement(int[] arr){
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>1){
                return entry.getKey();
            }
        }
        return -1;
    }
    public static int countUniqueElements(int[] arr){
        if(arr==null||arr.length==0){
            return 0;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int count =0;
        for(int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                count++;
            }
        }
        return count;

    }

    public static int countRepeatingElements(int[] arr){
        if(arr==null||arr.length==0){
            return 0;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                count++;
            }
        }
        return count;
    }

    public static int findHighestFrequency(int[] arr){
        if(arr==null||arr.length==0){
            return 0;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int highestFrequency=0;
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>highestFrequency){
                highestFrequency=entry.getValue();
            }
        }
        return highestFrequency;
    }
}
