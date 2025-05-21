import java.util.*;
public class Example_3_12 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       int inp, oddCounter = 0, evenCounter = 0;
       while(true){
           inp = scanner.nextInt();
           if(inp == 0){
               break;
           }
           if(inp % 2 == 0){
                oddCounter++;
           }else{
               evenCounter++;
           }
       }

        System.out.println("Odd numbers: " + oddCounter);
        System.out.println("Even numbers: " + evenCounter);
    }
}
