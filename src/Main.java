//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int j = 1;
        for(int i = 1; i <= 10; i++){
            for( j = 1; j <= 10; j++){
                if(i * j >= i * i){
                    System.out.print("\t" + j * i);
                    System.out.print("Hello Java");
                }
            }
            System.out.println('\n');
        }
    }
}