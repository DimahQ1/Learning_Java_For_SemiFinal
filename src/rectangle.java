import java.util.Scanner;

public class rectangle{
    static Scanner scanner = new Scanner(System.in);
    private double x;
    private double y;
    private double area;
    private double peri;

    public void readSides(){
        System.out.print("Enter rectangle's height: ");
        x = scanner.nextDouble();
        System.out.println("\nEnter rectangle's width: ");
        y = scanner.nextDouble();
    }
    public void calculate(){
        peri = (x + y) * 2;
        area = x * y;
    }
    public void display(){
        System.out.printf("area = %f, perime = %f", area, peri);
    }
}