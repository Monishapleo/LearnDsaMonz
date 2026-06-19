package com.learn.sorting;

import java.util.Arrays;

public class SelectionSortClass {
    public static void main(String[] args) {
        int[] arr={1,3,24,5,7};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    public static int[] selectionSort(int[] arr){
        if(arr == null || arr.length == 0){
            return new int[]{};
        }
        for(int i =0 ; i<arr.length-1; i++){
            int minIndex=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                   minIndex=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
