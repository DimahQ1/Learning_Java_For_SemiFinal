import java.util.*;
public class Example_4_2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        rect.readSides();
        rect.calculate();
        rect.display();
    }
}

