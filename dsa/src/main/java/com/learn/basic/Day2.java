package com.learn.basic;

import java.util.Arrays;

import static java.lang.Math.min;

public class Day2 {
    public static void main(String[] args) {

        //fibonacciSeries(7);
        //System.out.println(gcd(1000,500));
       // System.out.println(strongNumber(1452));
        int arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(reverseAnArray(arr)));
    }
    public static void fibonacciSeries(int n){
        int previous =0;
        int current =1;
        System.out.println(previous);
        System.out.println(current);
        for(int i=2; i<n;i++){
            int next = current+previous;
            previous=current;
            current=next;
            System.out.println(next);
        }
    }

    public static int gcdBruteForce(int a,int b){
        int gcd = 0;
        int n= min(a,b);
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    public static int gcd(int a,int b){
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int lcm(int a,int b){
        int gcd=gcd(a,b);
        return (a*b)/gcd;
    }

    public static boolean strongNumber(int n){
        int sum=0;
        int originalN=n;
        while(originalN>0){
            int temp=originalN%10;
            int factorial = factorialOfN(temp);
            sum=sum+factorial;
            originalN=originalN/10;
        }
        return n==sum;
    }

    public static int factorialOfN(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        return factorial;
    }

    static int[] reverseAnArray(int[] arr){
        
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
}
