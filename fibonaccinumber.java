package patternpractice;

public class fibonaccinumber {
    public static void main(String[] args){
        int num1=0,num2=1,num3,total=10;
        System.out.print(num1+" "+num2);
        for (int i = 2; i <=total ; i++) {
            num3=num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;

        }
    }
}
