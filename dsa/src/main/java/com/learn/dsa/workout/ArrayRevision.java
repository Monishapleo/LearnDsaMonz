package com.learn.dsa.workout;

import java.util.Arrays;

import static java.lang.Integer.MIN_VALUE;

public class ArrayRevision {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6};
        int[] arr1 = {1, 0, 3, 0, 5, 6, 0};
       /* reverseArray(arr);
        minAndMax(arr);
        secondLargestElement(arr);
        moveZerosToEnd(arr1);
        moveZerosToStart(arr1);
        System.out.println("Is sorted : "+checkIfArrayIsSorted(arr));*/

        //removeDuplicatesInSortedArray(arr);

        arrayLeftRotate(arr);
    }

    static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void minAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
            if (max < j) {
                max = j;
            }
        }
        System.out.println("MIN : " + min);
        System.out.println("MAX : " + max);
    }

    static void secondLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second Largest : " + secondLargest);
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
    static void moveZerosToStart(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println("Move zeros to start "+Arrays.toString(arr));
    }
/*Check if array sorted
    Input: [1,2,3,4,5]
    Output: true
    Input: [1,3,2,4]
    Output: false*/

    static Boolean checkIfArrayIsSorted(int[] arr){
        System.out.println(Arrays.toString(arr));
        for(int i=1; i<arr.length;i++){
            if(arr[i]<arr[i-1]) {
                return false;
            }
        }
        return true;
    }

    static void removeDuplicatesInSortedArray(int[] arr){
        int finalArr[] = new int[arr.length];
        int j=0;
        for(int i=1 ; i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                finalArr[j]=arr[i-1];
            }else if(arr[i]==arr[i-1]){
                finalArr[j]=arr[i-1];

            }
            j++;
        }
        System.out.println(Arrays.toString(finalArr));
    }

    static void arrayLeftRotate(int[] arr){
        //1,2,3,4,5
        int temp=arr[0];
        for(int i=0; i < arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));

    }
}
