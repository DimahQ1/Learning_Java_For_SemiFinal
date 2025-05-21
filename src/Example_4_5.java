import java.util.*;
public class Example_4_5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date(11, 9, 2011);
        d1.display();
        System.out.println();
        d2.display();

    }
    public static class Date{
        private int day, month, year;
        Date(int d, int m , int y){
            setDate(d , m , y);
        }
        Date(){
            setDate(11,11,2011);
        }
        public void setDate(int d ,int m , int y){
            year = y;
            month = m;
            day = d;
        }
        public void display(){
            System.out.printf("%d/%d/%d", day, month, year);
        }
    }
}
