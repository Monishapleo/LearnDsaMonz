package com.learn.dsa.workout;

import java.util.Arrays;

public class ArrayRevision1 {
    public static void main(String[] args) {
        int[] arr ={3,6,9,12,12,13};
        int[] arr1 ={0,6,9,0,12,13};
        int[] arr2 ={1,2,3,4,5,6};
        //reverseArray(arr);
      //  findMinAndMax(arr);
       // secondLargest(arr);
        //moveZerosToEnd(arr1);
        removeDuplicates(arr);

    }

    static void reverseArray(int[] arr){
        int n= arr.length;
        for(int i =0; i<n/2 ; i++){
            int temp = arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.println("Array Reversed : "+ Arrays.toString(arr));
    }

    static void findMinAndMax(int arr[]){
        int max=arr[0];
        int min=arr[0];
         for( int i = 0; i<arr.length;i++){
             if(arr[i]>max){
                 max=arr[i];
             } if(arr[i]<min){
                 min=arr[i];
             }
         }
        System.out.println("MAX : "+max);
        System.out.println("MIN : "+min);
    }

    static void secondLargest(int[] arr){
        System.out.println("ARR : "+Arrays.toString(arr));
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second Largest : "+secondLargest);
    }

    static void moveZerosToEnd(int[] arr){
        System.out.println("ARR : "+Arrays.toString(arr));
        int j=0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println("Move zeros to end : "+Arrays.toString(arr));
    }

    static void removeDuplicates(int[] arr){
        int j = 0;

        for(int i = 1; i < arr.length; i++){
            System.out.println("J1 : "+j);
            if(arr[i] != arr[j]){
                j++;
                System.out.println("J2 : "+j);
                arr[j] = arr[i];
            }
        }

        System.out.println("ARRAYS ARE : "+Arrays.toString(Arrays.copyOf(arr, j+1)));
    }

}
