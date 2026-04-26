package com.learn.dsa.workout;

import com.fasterxml.jackson.core.JsonToken;

import java.util.*;

public class Beginner {
    public static void main(String[] args) {
        int[] arr={1,1,3,3,6,7,8};
        int[] arr1={0,0,0,2,3,0,4,5,6};
        //moveZerosToEnd(arr1);
        //twoSumWithoutDuplicate(arr,5);
        //isAnagram("listen","silents");
       // firstNonRepeatingCharacterOptimized("aabbcdde");
       // findTheMissingNum(arr1);
        //firstNonRepeatingCharacter("Annnu");
       // frequencyCount(arr);
        removeDuplicates(arr);
        /*secondLargest(arr);
        swapTwoNumWithTemp(5,10);
        swapWithoutTemp(-5,10);*/
       /* minAndMax(arr);
        sumOfArray(arr);
        countOddAndEven(arr);
        stringReverse("Potato");
        checkPalindrome("AnnA ");
        validPalindrome("A man, a plan, a canal: Panama");
        countVowels("Monisha");
        wordCount("Habibi!     how are you");
        wordCount("");
        manualWordCount("Tommeyy");*/
    }
    public static  void minAndMax(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<arr.length ; i++){
            if(min>=arr[i]){
                min=arr[i];
            }
            if(max<=arr[i]){
                max=arr[i];
            }
        }

        System.out.println("MIN : "+min);
        System.out.println("MAX : "+max);

    }

    public static void sumOfArray(int[] arr){
        int sum=0;
        for(int num :arr){
            sum=sum+num;
        }
        System.out.println("SUM OF ARR : "+sum);
    }

    public static void countOddAndEven(int[] arr){
        int odd=0;
        int even=0;

        for(int num :arr){
            if(num==0){
                continue;
            }
            if(num%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Odd count : "+odd);
        System.out.println("Even count : "+even);
    }

    public static void stringReverse(String str){
        String reversedString="";
        for (int i=str.length()-1; i>=0;i--){
            reversedString=reversedString+str.charAt(i);
        }
        System.out.println("reversed using loop : "+reversedString);

        StringBuilder sb=new StringBuilder();
        sb.append(str);
        System.out.println("reversed using stringBuilder : "+sb.reverse());

        StringBuilder reversed = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            reversed.append(str.charAt(i));
        }
        System.out.println("Reversed loop stringBuilder : "+reversed);

    }

    public static  void checkPalindrome(String str){
        str = str.replaceAll("\\s+", "");
        int left=0;
        int right=str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                System.out.println(str+" not a Palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println(str +" is a palindrome ");
    }

    public static void validPalindromeOptimized(String str){
        int left = 0;
        int right = str.length() - 1;

        while(left < right){

            // skip non-alphanumeric
            while(left < right && !Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }

            while(left < right && !Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }

            // compare ignoring case
            if(Character.toLowerCase(str.charAt(left)) !=
                    Character.toLowerCase(str.charAt(right))){
                System.out.println("Not Palindrome : "+str);
                return;
            }

            left++;
            right--;
        }

        System.out.println("Palindrome "+str);
    }

    public static void countVowels(String str){
        int count =0;
        for(int i = 0 ; i <=str.length()-1;i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("Vowels count for "+str+" is "+count);

    }

    public static void wordCount(String str){
        if(str == null || str.trim().isEmpty()){
            System.out.println("Word count: 0");
            return;
        }
        String[] arr = str.trim().split("\\s+");
        System.out.println("Word count: " + arr.length);
    }

    //OPTIMIZED
    public static void manualWordCount(String str){
        int count = 0;
        boolean inWord = false;
        for(int i = 0 ; i<str.length(); i++){
            if(str.charAt(i)!=' ' && !inWord){
                count++;
                inWord=true;
            }else if(str.charAt(i) == ' ') {
                inWord=false;
            }
        }
        System.out.println("Word count - manual : " + count);
    }

    public static void fizzBuzz(int n){
        for(int i = 1; i <= n; i++){

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }

    public static void secondLargest(int[] arr){
        int largest= Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            } else if (num>secondLargest && num !=largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second largest is "+secondLargest);
    }

    public static void swapTwoNumWithTemp(int a , int b){
        System.out.println("A before : "+a);
        System.out.println("B before : "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("A after : "+a);
        System.out.println("B after : "+b);
    }

    public static void swapWithoutTemp(int a, int b){
        System.out.println("Before: a=" + a + " b=" + b);

        a = a + b; //5+10 = 15
        b = a - b; //15-10 = 5
        a = a - b; //15-5 = 10

        System.out.println("After: a=" + a + " b=" + b);
    }

    static void removeDuplicates(int[] arr){
        System.out.println("Array : "+Arrays.toString(arr));
        int j = 0;

        for(int i = 1; i < arr.length; i++){
            System.out.println("J1 : "+j);
            if(arr[i] != arr[j]){
                j++;
                System.out.println("if I : "+i);
                System.out.println("if J : "+j);
                System.out.println("a[i] : "+arr[i]);
                System.out.println("a[j] : "+arr[j]);
                System.out.println("==========================================");
                arr[j] = arr[i];
            }
        }
        System.out.println("Array : : "+Arrays.toString(arr));
        System.out.println("ARRAYS ARE : "+Arrays.toString(Arrays.copyOf(arr, j+1)));
    }
    static void removeDuplicatesUnsorted(int[] arr){
        Set<Integer> set = new LinkedHashSet<>();
        //Arrays.sort(arr);
        for(int num : arr){
            set.add(num);
        }

        System.out.println(set);
    }
    static  void frequencyCount(int[] arr){
        Map<Integer, Integer> countMap= new HashMap<>();
        for(Integer num : arr){
            if (countMap.containsKey(num)){
                countMap.put(num,countMap.get(num)+1);
            } else {
                countMap.put(num,1);
            }
        }
        System.out.println("Frequency of element is : "+countMap);
    }
    static void frequencyCountSimplified(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        System.out.println(countMap);
    }

    static void findTheMissingNum(int arr[]){
        //n*n+1/2
        int n=arr.length+1;
        int expected=n*(n+1)/2;
        int actual =0;
        int missing=0;
        for(int num : arr){
            actual+=num;
        }
        missing=expected-actual;
        System.out.println("Expected : "+expected);
        System.out.println("Actual : "+actual);
        System.out.println("Missing : "+missing);
    }

    static void firstNonRepeatingCharacterOptimized(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println("First non repeating char: " + ch);
                return;
            }
        }
    }

    static void isAnagram(String str, String str1) {
        Map<Character, Integer> map = new HashMap<>();

        if (str.length() != str1.length()) {
            System.out.println("Not an anagram");
            return; // 🔥 important
        }

        // Step 1: count str
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: reduce using str1
        for (char ch : str1.toCharArray()) {
            if (!map.containsKey(ch)) {
                System.out.println("Not an anagram");
                return;
            }
            map.put(ch, map.get(ch) - 1);
        }

        // Step 3: check all values = 0
        for (int value : map.values()) {
            if (value != 0) {
                System.out.println("Not an anagram");
                return;
            }
        }

        System.out.println("Anagram ✅");
    }

    public static void twoSumWithoutDuplicate(int[] arr, int target) {
        System.out.println("Array: " + Arrays.toString(arr));

        Map<Integer, Integer> map = new HashMap<>();
        Set<String> seenPairs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];

            if (map.containsKey(needed)) {

                int a = Math.min(arr[i], needed);
                int b = Math.max(arr[i], needed);

                String pair = a + "," + b;

                if (!seenPairs.contains(pair)) {
                    System.out.println("Pair found: " + a + " + " + b);
                    seenPairs.add(pair);
                }
            }

            map.put(arr[i], i);
        }
    }
    public static void twoSumDuplicatePair(int[] arr, int target) {
        System.out.println("Array: " + Arrays.toString(arr));

        Map<Integer, Integer> map = new HashMap<>();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];

            if (map.containsKey(needed)) {
                System.out.println("Pair found: " + needed + " + " + arr[i]);
                found = true;
            }

            map.put(arr[i], i);
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }
    static void moveZerosToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println("Move zeros to end "+Arrays.toString(arr));
    }
}
 /*public static void twoSum(int[] arr,int target){
        System.out.println("Array : "+Arrays.toString(arr));
        Map<Integer,Integer> count = new HashMap<>();
        int j=1;
        for (int k : arr) {
            //&& !count.containsValue(k) && !count.containsValue(arr[j])
            if (k + arr[j] == target) {
                count.put(k, k);
                count.put(arr[j], arr[j]);
                j++;
            }
        }
        System.out.println("Sums are : "+count);
    }*/
/*static void firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        char c = '0';
        for (int i = 0; i < str.length(); i++) {
            countMap.put(str.charAt(i), countMap.getOrDefault(str.charAt(i), 0) + 1);
        }
        for(HashMap.Entry<Character,Integer> entry:countMap.entrySet()){
            System.out.println("");
            if(entry.getValue().equals(1)){
                c= entry.getKey();
                break;
            }
        }
        System.out.println("Map : "+countMap);
        System.out.println("First non repeating char is : "+c);
    }*/
