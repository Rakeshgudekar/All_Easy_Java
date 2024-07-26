package patternpractice;



import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        float a=16;
        float b=17;
        float c=12;
        float d=20;
        float e=13;
        float f=17;

        float percent=percentage(a,b,c,d,e,f);
        System.out.println("pertcentage is "+percent);

    }
    public static float percentage(float a, float b, float c, float d, float e ,float f){
        float abc=(a+b+c+d+e+f)/600;
        float percent=abc*100;
        return percent;
    }
}
