import java.util.*;
public class Example_4_3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        simpleControl sc = new simpleControl();

        sc.setTemperature(12.2);
        System.out.println("now : " + sc.getTemperature());
    }
    public static class simpleControl{
        double temperature;
        public void setTemperature(double t){
            temperature = t;
        }
        public double getTemperature(){
            return temperature;
        }
    }
}
