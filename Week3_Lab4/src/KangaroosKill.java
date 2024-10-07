// Imports scanner to get input from user
import java.util.Scanner;

// Defining the class
public class KangaroosKill {

    // Names the scanner
    private static final Scanner keyboard = new Scanner(System.in);

    // Defines the finite variables
    public static double ROADWIDTH = 0.01;
    public static double ROADKILLRATE = 1.47;


    // defines main function
    public static void main(String[] args) {
        // gets input from user for sideLength, roadLength and numKangaroos
        System.out.print("Enter side of square in km : ");
        double sideLength = keyboard.nextDouble();
        System.out.print("Enter roads length in km : ");
        double roadLength = keyboard.nextDouble();
        System.out.print("Enter number of 'roos : ");
        int numKangaroos = keyboard.nextInt();

        // Calculates squareArea and rooDensity
        double squareArea = (sideLength * sideLength);
        double rooDensity = (numKangaroos/squareArea);

        // Calculates roadSurface
        double roadSurface = (roadLength * ROADWIDTH);

        // Calculates roosKilled
        double roosKilled = rooDensity * roadSurface * ROADKILLRATE;
        // Defines rooInjuries
        int rooInjuries;

        // Checks if roosKilled has a decimal
        if (roosKilled % 1 != 0) {
            rooInjuries = 1;

        } else {

            rooInjuries = 0;
        }

        // Prints out results
        System.out.println("Expected number of kills is : " + (int) roosKilled);
        System.out.println("Expected number of injuries is : " + rooInjuries);








    }

}
