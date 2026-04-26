package com.learn.dsa.workout;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.min;

public class Revise {
    public static void main(String[] args) {
        int[] arr = {0,2,43,1,0,1,0,6};
        int[] arr1 = {0,2,2,4,4,5,6};
        int[] arr3 = {1,2,3,4,5,6};
        findMaxWaterHold(arr3);
       // System.out.println(Arrays.toString(twoSum2(arr3, 6)));
        //moveZerosToEnd(arr);
       // removeDuplicatesSortedArr(arr1);
        /*int k = removeDuplicates(arr1);
        System.out.println("Count : "+k);*/
    }
    static void moveZerosToEnd(int arr[]){
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println("Move zeros to end : "+ Arrays.toString(arr));
    }

    static int[] twoSum(int arr[], int target){
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int i = 0 ; i<arr.length;i++){
            int needed = target-arr[i];
            if(countMap.containsKey(needed)){
                return new int[]{countMap.get(needed),i};
            }
            countMap.put(arr[i],i);
        }
        return new int[]{};
    }

    static void removeDuplicatesSortedArr(int arr[]){
        int j=0;
        for( int i = 1 ; i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        System.out.println("After removing duplicates : "+ Arrays.toString(Arrays.copyOf(arr, j+1)));
    }

    public static int removeDuplicates(int[] nums) {
        int j=0;
        for(int i = 1 ; i<nums.length;i++){
           if(nums[i]!=nums[j]){
               j++;
               nums[j]=nums[i];
           }
        }
        return j+1;
    }
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while (left<right){
            while (left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while (left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int[] twoSum2(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                return new int[]{left + 1, right + 1}; // ⚠️ 1-based index
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }

        return new int[]{};
    }

    /*public static void findMaxWaterHold(int[] arr){
        //{1,2,3,4,5}
        int left = 0;
        int right = arr.length-1;
        int maxSum=0;
        int height=0;
        int width=0;
        int area=0;

        while(left<right){
            //maxSum = arr[left]+arr[right]*(left-right);
            height=min(arr[left],arr[right]);
            width=right-left;
            area=height*width;
            System.out.println("left : "+left);
            System.out.println("right : "+right);
            System.out.println("maxSum : "+maxSum);
            if(arr[left]<arr[right]){
                left++;
            }else{
                right --;
            }
        }
    }*/
    public static void findMaxWaterHold(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        int maxArea = 0;

        while(left < right){
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = height * width;

            maxArea = Math.max(maxArea, area); 

            if(arr[left] < arr[right]){
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Max water: " + maxArea);
    }
}
