package com.company;

//*****
//*****
//*****
//*****
//*****


public class Pattern1 {
    public static void main(String[] args){
        print2(5);
    }

    static void print2( int n){
        for (int row=1; row <=n; row++){
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
