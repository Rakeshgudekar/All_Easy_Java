package patternpractice;
import java.util.*;



public class Swapping {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        System.out.println("enter number1");
        int a=scn.nextInt();
        System.out.println("Enter number2");
        int b=scn.nextInt();
        System.out.println("==========BEFORE========");
        System.out.println("number1 =" +a);
        System.out.println("number2 =" +b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("========AFTER=======");
        System.out.println("number1 =" +a);
        System.out.println("number2 =" +b);


    }
}
