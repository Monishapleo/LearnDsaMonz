package com.learn.basic;public class Day1Revision {
    public static void main(String[] args) {

       // System.out.println(countDigits(0));
      //  System.out.println(reverseNum(1223));
        //System.out.println(isPalindrome(2332));
       // System.out.println(sumOfDigits(2332));
       // System.out.println(largestDigit(2392));
        System.out.println(isPerfectNumber(7));
    }
    public static  int countDigits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

    public static int reverseNum(int n){
        int reverse = 0;
        while(n>0){
            int temp=n%10;
            reverse=reverse*10+temp;
            n=n/10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int n){
        int reverse = 0;
        int digit=n;
        while (digit>0){
            int temp = digit%10;
            reverse=reverse*10+temp;
            digit=digit/10;
        }
        return n==reverse;
    }
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int temp = n%10;
            sum=sum+temp;
            n=n/10;
        }
        return sum;
    }
    public static int largestDigit(int n){
        int largest=0;
        while(n>0){
            int temp = n%10;
            if(temp>largest){
                largest=temp;
            }
            n=n/10;
        }
        return largest;
    }
    public static int smallestDigit(int n){
        int smallest=Integer.MAX_VALUE;
        while(n>0){
            int temp = n%10;
            if(temp<smallest){
                smallest=temp;
            }
            n=n/10;
        }
        return smallest;
    }

    public static int productOfDigits(int n){
        int product = 1;
        while(n>0){
            int temp = n%10;
            product=product*temp;
            n=n/10;
        }
        return product;
    }

    public static boolean isPerfectNumber(int n){
        int sum = 0;
       for (int i = 1 ; i<n;i++){
           if(n%i==0){
               sum=sum+i;
           }
       }
       return sum==n;
    }
}
