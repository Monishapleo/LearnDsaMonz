package com.learn.dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements : ");
        Scanner sc = new Scanner(System.in);
        int elements = sc.nextInt();
        arrayTraversal(elements, sc);
        arrayAccessing();
        arrayInsertion();
        arrayDeletion();
        sumOfArray();
        minAndMaxArray();
        reverseAnArrayUsingFor();
        prefixSum();
        arrayReverseUsingWhile();
    }

    //Array
    static void arrayTraversal(int elementCount, Scanner sc) {
        System.out.println("Enter " + elementCount + " numbers:");
        int simpleArray[] = new int[elementCount];
        for (int i = 0; i <= simpleArray.length; i++) {
            System.out.println(i * i);
        }

        for (int i = 0; i < simpleArray.length; i++) {
            simpleArray[i] = sc.nextInt();
        }
        System.out.println("You entered:");
        for (int i = 0; i < simpleArray.length; i++) {
            System.out.println("Index " + i + " -> " + simpleArray[i]);
        }
        int[] arr = {5, 10, 15, 20, 25};

        int i = 0;

        while (i < arr.length) {
            System.out.println("Index " + i + " -> " + arr[i]);
            i++; // move to next index
        }
    }

    static void arrayAccessing() {
        long[] arr = {5, 10, 15, 20, 25};
        arr[2] = 144;
        System.out.println("arr[2] is " + arr[2]);
    }

    static void arrayInsertion() {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 3;
        int n = 3;
        System.out.println("Before Insertion : " + Arrays.toString(arr));
        for (int i = n; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = 99;
        System.out.println("After Insertion : " + Arrays.toString(arr));

    }

    static void arrayDeletion() {
        long[] arr = {5, 10, 15, 20, 25};
        int n = arr.length;
        System.out.println("Before Deletion : " + Arrays.toString(arr));

        for (int i = 2; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;
        System.out.println("Array after deletion");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void sumOfArray() {
        long[] arr = {1, 2, 3, 4, 5};
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    static void minAndMaxArray() {
        long[] arr = {5, 10, 15, 20, 25};
        long min = arr[0];
        long max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Minimum number in array is : " + min);
        System.out.println("Maximunm number in array is : " + max);

    }

    static void reverseAnArrayUsingFor() {
        long[] arr = {5, 10, 15, 20, 25};
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            long temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        for (long m : arr) {
            System.out.println(m);
        }
    }

    static void prefixSum() {
        int[] arr = {2, 4, 6, 8, 10};
        int length = arr.length;
        int[] prefixArray = new int[length];
        prefixArray[0] = arr[0];
        for (int i = 1; i < length; i++) {
            prefixArray[i] = prefixArray[i - 1] + arr[i];
        }
        for (int num : prefixArray) {
            System.out.println(num);
        }

    }

    static void arrayReverseUsingWhile() {
        long[] arr = {5, 10, 15, 20, 25};
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            long temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (long num : arr) {
            System.out.println(num);
        }
    }
}
