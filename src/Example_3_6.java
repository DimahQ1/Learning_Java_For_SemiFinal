import java.util.*;
public class Example_3_6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 0 , sum = 0, inp = 1;
        while(inp != 0){
            inp = scanner.nextInt();
            sum += inp * inp;
            i++;
        }
        System.out.println("Counter: " + (i - 1));
        System.out.println("Sum of Sqrt of numbers : " + sum);
    }
}
