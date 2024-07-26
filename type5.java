package patternpractice;

public class type5 {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalrow = row > n ? 2 * n - row : row;
            int spaces = n - totalrow;
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
