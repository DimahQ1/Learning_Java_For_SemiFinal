import java.util.*;
public class Example_3_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x ,i , sum = 0, avg;
        for(i = 1; i <= 5 ; i++){
            x = scanner.nextInt();
            sum += x;
        }
        avg = sum / 5;
        System.out.println("average = " + avg);
    }
}
