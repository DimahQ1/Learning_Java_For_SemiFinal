import java.util.*;
public class Example_3_5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num = scanner.nextInt();
        long f = 1;
        for(int i = 2; i <= num; i++){
            f *= i;
        }
        System.out.println(f);
    }
}
