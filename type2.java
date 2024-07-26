package patternpractice;

//* * * * *
//* * * *
//* * *
//* *
//*
public class type2 {
    public static void main(String[] args){
         print(5);
    }
    static void print (int n){
        for(int row=0;row<n; row++){
            for(int col=0;col<n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
