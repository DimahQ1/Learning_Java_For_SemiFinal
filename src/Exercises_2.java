import java.util.*;
import java.lang.*;
public class Exercises_2{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if(str1.compareTo(str2) == 0){
            System.out.println("str1 == str2");
        }
        if(str1.compareTo(str2) > 0){
            System.out.println("str1 < str2");
        }
        if(str1.compareTo(str2) < 0){
            System.out.println("str1 > str2");
        }
    }
}
