import java.awt.*;
import java.util.*;
public class studentInfo {
    static Scanner scanner = new Scanner(System.in);
    private long studentNo;
    private String name;
    private short score;
    public void getInfo(){
        checkName();
        checkNO();
        checkScore();
        displayInfo();
    }
    private void checkName(){

        boolean isOk = true;
        while(isOk){
            System.out.println("git ali");
            System.out.println("Enter Student name: ");
            name = scanner.nextLine();
            if(name.isEmpty() || name.isBlank() || name.startsWith(" ")){
                System.out.println("Name cannot empty or starts with space \" \"!");
                continue;
            }
            else{
                isOk = false;
            }
        }
    }
    private void checkNO(){
        boolean isOk = true;
        while(isOk){
            System.out.printf("Enter %s student number: ", name);
            studentNo = scanner.nextLong();
            if(studentNo < 400100000){
                System.out.println("The Studen number cannot be less than 400100000 !   ");
                continue;
            }
            else{
                isOk = false;
            }
        }
    }
    private void checkScore(){
        boolean isOk = true;
        while (isOk){
            System.out.printf("Enter %s score: ", name);
            score = scanner.nextShort();
            if(score < 0 || score > 20){
                System.out.println("The score cannot be less than 0 and more than 20!");
                continue;
            }
            else{
                isOk = false;
            }
        }
    }
    private void displayInfo(){
        System.out.println("Student name: " + name);
        System.out.println("Student number: " + studentNo);
        System.out.println("Student score: " + score);

    }
}
