import java.util.*;
public class Example_4_6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Date1 d1 = new Date1();
        Date1 d2 = new Date1(11, 9, 2011);
        d1.display();
        System.out.println();
        d2.display();

    }
    public static class Date1{
        private int day, month, year;
        Date1(int day, int month , int year){
            setDate(day , month , year);
        }
        Date1(){
            this(11,11,2011);
        }
        public void setDate(int day ,int month , int year){
            this.year = year;
            this.month = month;
            this.day = day;
        }
        public void display(){
            System.out.printf("%d/%d/%d", day, month, year);
        }
    }
}
