package com.learn.basic;

import java.util.Arrays;

public class Day1 {
    public static void main(String[] args) {
        //print1To100();
        //printEvenNum1To100();
        //System.out.println(sumOfN(5));
        //System.out.println(countDigits(123));
        //System.out.println(reverseNumber(123));
        //System.out.println(isPalindrome(111112));
        //System.out.println(isPrime(3));
        //System.out.println(factorial(3));
        //System.out.println(sumOfDigits(321));
        //System.out.println(isArmstrong(153));
        //System.out.println(largestInN(153));
        //System.out.println(smallestDigit(123));
        //System.out.println(productOfDigits(123));
        //System.out.println(isPerfectNumber(6));
        System.out.println(countEvenDigits(0));
    }
    public static void print1To100(){
        System.out.println("********PRINTING 1 TO 100*******");
        for(int i = 1 ; i<=100 ; i++){
            System.out.println(i);
        }
    }

    public static void printEvenNum1To100(){
        System.out.println("********PRINTING EVEN NUMBERS BETWEEN 1 TO 100*******");

        //int i =1 ; i<=100 ; i++
        for(int i =2 ; i<=100 ; i+=2){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static int sumOfN(int n){
        int sum = 0;
        for(int i =0; i<=n; i++){
            sum=sum+i;
        }
        return sum;
    }

    public static int countDigits(int n){
        int count = 0;
       while (n>0){
           n=n/10;
           count++;
       }
       return count;
    }
    public static int reverseNumber(int n){
        StringBuilder str = new StringBuilder();
        while(n>0){
            int temp = n%10;
            n=n/10;
            str.append(temp);
        }
        return Integer.parseInt(String.valueOf(str));
    }
    public static int reverseNumberInt(int n){
        int reverse = 0;

        while(n > 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return reverse;
    }

    public static boolean isPalindrome(int n){
        int reverse =0;
        int temp =n;
        while(temp > 0){
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
        return n == reverse;

    }
    public static boolean isPrime(int n){
        for (int i =2 ; i<n ; i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
    public static int factorial(int n){
        int temp =1;
        for(int i =1; i<=n ; i++){
            temp = temp*i;
        }
        return temp;
    }

    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int temp = n%10;
            sum = temp+sum;
            n=n/10;
        }
        return sum;
    }

    public static boolean isArmstrong(int n){
        int sumOfCubedDigits=0;
        int digit =n;
        while(digit>0){
            int temp  = digit%10;
            sumOfCubedDigits=sumOfCubedDigits+temp*temp*temp;
            digit =digit/10;
        }
        System.out.println("sumOfCubedDigits : "+sumOfCubedDigits);
        return sumOfCubedDigits == n;
    }

    public static int largestInN(int n){
        int largest =0;
        if(n==0){
            return 0;
        }
        while(n>0){
            int temp=n%10;
            //largest=temp>largest?temp:largest;
            largest= Math.max(temp, largest);
            n=n/10;
        }
        return largest;
    }
    public static int smallestDigit(int n){
        int smallest =Integer.MAX_VALUE;
        if(n==0){
            return 0;
        }

        while (n>0){
            int temp=n%10;
            smallest=Math.min(smallest,temp);
            n=n/10;
        }
        return smallest;
    }
    public static int productOfDigits(int n){
        if(n==0){
            return 0;
        }
        int product =1;
        while(n>0){
            int temp = n%10;
            product=product*temp;
            n=n/10;
        }
        return product;
    }
    public static boolean isPerfectNumber(int n){
        int sumOfDivisor=0;
        for (int i=1;i<n;i++){
            if(n%i==0){
                sumOfDivisor=sumOfDivisor+i;
            }
        }
        return n==sumOfDivisor;
    }
    public static int countEvenDigits(int n){
        int count =0;
        /*if(n==0){
            return 0;
        }*/
        while(n>0){
            int temp =n%10;
            if(temp%2==0){
                count++;
            }
            n=n/10;
        }
        return count;
    }

    public static int secondLargest(int n){
        int largest =0;
        int secondLargest =0;

        while(n>0){
            int temp =n%10;
            if(temp>largest){
               secondLargest=largest;
               largest=temp;

            }else if(temp>secondLargest && temp!=largest){
                secondLargest=temp;
            }
            n=n/10;
        }
        if(secondLargest==0){
            return -1;
        }
        return secondLargest;
    }
}
