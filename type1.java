package patternpractice;
//*
//* *
//* * *
//* * * *

import java.util.Scanner;

public class type1 {
    public static void main(String[] args) {
      roshanGudekar(5);

    }

    static void roshanGudekar(int n ){
        for(int row=0;row<n;row++){
            for(int col=0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
