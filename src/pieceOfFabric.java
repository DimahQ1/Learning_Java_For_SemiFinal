import java.util.*;
public class pieceOfFabric {
    static Scanner scanner = new Scanner(System.in);
    private double sqMeters;
    public void readSqMeters(){
        System.out.println("Enter fabric size in meters: ");
        sqMeters = scanner.nextDouble();
    }
    public double toYards(){
        return sqMeters * 1.96;
    }
    public void displayFabric(){
        System.out.println("Fabric size in \"Meters\" : " + sqMeters);
        System.out.println("Fabric size in \"Yards\" : " + toYards());
    }
}
