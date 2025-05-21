import java.util.*;
public class Example_3_7 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        num = scanner.nextInt();
        do{
            System.out.print(num % 10);
            num /= 10;
        }while (num != 0);
    }
}
