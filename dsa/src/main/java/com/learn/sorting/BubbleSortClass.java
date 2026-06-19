package com.learn.sorting;

import java.util.Arrays;

public class BubbleSortClass {
    public static void main(String[] args) {

        int[] arr={1,3,24,5,7};
        System.out.println(Arrays.toString(bubbleSortBasic(arr)));
    }

    public static int[] bubbleSortBasic(int[] arr){
        if(arr==null||arr.length==0){
           return new int[]{};
        }
        for(int i=0 ; i<arr.length-1;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static int[] bubbleSortOptimized(int[] arr){

        if(arr == null || arr.length == 0){
            return new int[]{};
        }

        for(int i=0; i<arr.length-1; i++){

            boolean swapped = false;

            for(int j=0; j<arr.length-1-i; j++){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }

        return arr;
    }
}
