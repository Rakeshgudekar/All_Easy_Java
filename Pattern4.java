package com.company;


//1
//1 2
//1 2 3
//1 2 3 4

public class Pattern4 {
    public static void main(String[] args) {
       print(4);
    }
    static void print(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }
}