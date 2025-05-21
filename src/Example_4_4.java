import java.util.*;
public class Example_4_4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Time time1 = new Time(12, 32,41);
        Time time2 = new Time(7, 10, 31);
        time1.display();
        System.out.println( );
        time2.display();

    }
    public static class Time{
        private int hour, minute, second;
        Time(int h, int m , int s){
            hour = h;
            minute = m;
            second = s;
        }
        public void display(){
            System.out.printf("%d:%d:%d", hour, minute, second);
        }
    }
}
