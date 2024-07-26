package patternpractice;

public class patt {
    public static void main(String[] args) {
        print(7);
    }
    static void print(int n){
        for (int row = 1; row <=n ; row++) {
                   if(row%2==0){
                       row++;
                   }
            for (int col = 1; col <=row ; col++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }

}
