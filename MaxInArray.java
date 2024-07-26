package com.company;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr={2,4,5,43,45,65,34,56,54,22,34,44};
        int ans= max(arr);
        System.out.println("max in whole array");
        System.out.println(ans);

        //for maxvalue in range
        int rangeMax=maxinrange(arr,6,10);
        System.out.println("max in range");
        System.out.println(rangeMax);

    }

    static int max(int[] arr) {
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
               if(arr[i]>max){
                   max=arr[i];
               }
        }
        return max;
    }

    static int maxinrange(int[] arr ,int start ,int end){
        int max=arr[start];
        for (int i =start; i <=end ; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

}
