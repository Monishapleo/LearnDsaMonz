package com.learn.basic;

public class Day3 {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 4, 5};
        //System.out.println(smallestElementIndex(arr));
        //System.out.println(rangeOfArray(arr));
        System.out.println(numberThatAppearOnce(arr));
    }

    public static int smallestElementIndex(int[] arr){
        if(arr == null || arr.length == 0){
            return -1;
        }
        int smallestIndex=0;
        for(int i =1; i<arr.length ; i++){
            if(arr[i]<arr[smallestIndex]){
                smallestIndex=i;
            }
        }
        return smallestIndex;
    }
    public static int sumOfEvenElements(int[] arr){
        if(arr == null || arr.length == 0){
            return -1;
        }

        int sum=0;
        for (int j : arr) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        return sum;
    }
    public static int firstEvenElement(int[] arr){
        if(arr == null){
            return -1;
        }
        for (int i : arr){
            if(i%2==0){
                return i;
            }
        }
        return -1;
    }
    public static boolean isPalindromeArray(int[] arr){
        if(arr == null){
            return false;
        }
        int start =0;
        int end = arr.length-1;
        for (int i=0;i<arr.length;i++){
            if(arr[start]!=arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static int lastEvenElement(int[] arr){
        if(arr == null){
            return -1;
        }
        int lastEven=0;
        for(int i : arr){
            if(i%2==0){
                lastEven=i;
            }
        }
        if(lastEven==0){
            return -1;
        }
        return lastEven;
    }
    public static int countOccurrences(int[] arr, int target){
        int count=0;
        for(int i : arr){
            if(i==target){
                count++;
            }
        }
        return count;
    }
    public static int sumOfOddElements(int[] arr){
        int sum=0;
        for (int i:arr) {
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
    public static int largestElement(int[] arr){
        if(arr == null || arr.length==0){
            return -1;
        }
        int largest=arr[0];
        for(int i : arr){
            if(i>largest){
                largest=i;
            }
        }
        return largest;
    }
    public static int smallestElement(int[] arr){
        if(arr == null || arr.length==0){
            return -1;
        }
        int smallest = arr[0];
        for(int i =1; i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }

        return smallest;
    }
    public static int rangeOfArray(int[] arr){
        if(arr == null || arr.length==0){
            return -1;
        }
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }else if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return largest-smallest;

    }
    public static int secondLargestElement(int[] arr){
        if(arr == null || arr.length < 2){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
    public static boolean containsElement(int[] arr, int target){
        if(arr == null || arr.length==0){
            return false;
        }
        for(int i : arr){
            if(i==target){
                return true;
            }
        }
        return false;
    }
    public static boolean isSorted(int[] arr){
        if(arr == null || arr.length==0){
            return false;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    public static int countPositiveNumbers(int[] arr){
        int count=0;
        if(arr == null || arr.length==0){
            return count;
        }
        for(int i : arr){
            if(i>0){
                count++;
            }
        }
        return count;
    }
    public static int countNegativeNumbers(int[] arr){
        int count=0;
        if(arr == null || arr.length==0){
            return count;
        }
        for(int i : arr){
            if(i<0){
                count++;
            }
        }
        return count;
    }
    public static int firstNegativeNumber(int[] arr){
        if(arr == null || arr.length==0){
            return -1;
        }
        for(int i : arr){
            if(i<0){
                return i;
            }
        }
        return -1;
    }
    public static int countAdjacentEqualPairs(int[] arr){
        if(arr == null || arr.length==0){
            return 0;
        }
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                count++;
            }
        }
        return count;
    }
    public static boolean hasAdjacentDuplicates(int[] arr){
        if(arr == null || arr.length==0){
            return false;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                return true;
            }
        }
        return false;
    }
    public static boolean hasDuplicate(int[] arr){
        if(arr == null || arr.length==0){
            return false;
        }

        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static int countDuplicatePairs(int[] arr){
        if(arr == null || arr.length==0){
            return 0;
        }
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                   count++;
                }
            }
        }
       return count;
    }

    public static boolean hasPairWithSum(int[] arr, int target){
        if(arr == null || arr.length<=2){
            return false;
        }
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    public static int countPairsWithSum(int[] arr, int target){
        if(arr == null || arr.length<2){
            return 0;
        }
        int count =0;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                   count++;
                }
            }
        }
        return count;
    }

    public static int[] firstPairWithSum(int[] arr, int target){
        if(arr == null || arr.length<2){
            return new int[]{};
        }

        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static int largestPairSum(int[] arr){
        if(arr == null || arr.length<2){
            return -1;
        }
        int largestSum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int currentSum=arr[i]+arr[j];
                if(currentSum>largestSum){
                    largestSum=currentSum;
                }

            }
        }
        return largestSum;
    }

    public static int findMissingNumber(int[] arr){
        if(arr == null || arr.length==0){
            return -1;
        }
        int n = arr.length+1;
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for (int j : arr) {
            actualSum += j;
        }
        return expectedSum - actualSum;
    }

    public static int numberThatAppearOnce(int[] arr){
        if(arr == null || arr.length==0){
            return -1;
        }
        int count =0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                   count++;
                }

            }

        }
        return -1;

    }
}
