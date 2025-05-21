import java.util.*;

public class PascalTriangle {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Rows
        int Radif = 5;

        for (int i = 0; i < Radif; i++) {
            for (int j = 0; j < Radif - i; j++) {
                System.out.print("  ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%5d", number);
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
