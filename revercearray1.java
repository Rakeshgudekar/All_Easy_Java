package patternpractice;

import java.util.Arrays;

public class revercearray1 {
    public static void main(String[] args) {
        int[] arr= {3, 4, 12, 23, 32, 56};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        return arr;
    }
}
