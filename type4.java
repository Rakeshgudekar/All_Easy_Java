package patternpractice;
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
public class type4 {

    public static void main(String[] args){
        print(5);
    }
    static void print(int n){
        for (int row = 1; row <=2*n-1; row++) {
            int totalcol= row>n ? 2*n-row:row;
            for (int col = 1; col <=totalcol ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }


}
