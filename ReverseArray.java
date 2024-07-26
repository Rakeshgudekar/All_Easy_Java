package com.company;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,9,76,54,34,64,54,66,87,76,43,99};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

   static int[] Reverse(int[] arr) {
       int start=0;
       int end=arr.length-1;
       while(start<end) {
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
       return arr;
    }



}
