import java.util.Scanner;
public class StreetMaintenanceDurban {
    public static final Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("WEEK 7 - LAB 6");


        System.out.print("How many houses in the street?  : ");
        int numberOfHouseInStreet = keyboard.nextInt();
        System.out.println(" ");


        int [] houseNumbers = new int[numberOfHouseInStreet];
        int index;

        for (index = 0; index < houseNumbers.length; index++) {
            System.out.print("What is the next house number?  :  ");
            houseNumbers[index] = keyboard.nextInt();

        } //End of the for loop
        System.out.println(" ");


        // Declare
        int [][] houseAges = new int[numberOfHouseInStreet][];
        int rowIndex;
        int colIndex;

        for (rowIndex = 0; rowIndex < houseAges.length; rowIndex++) {

            System.out.print("How many people live in house " + houseNumbers[rowIndex] + "?   :  ");
            int peopleInHouse = keyboard.nextInt();
            houseAges[rowIndex] = new int [peopleInHouse];

            for (colIndex = 0; colIndex < houseAges[rowIndex].length; colIndex++) {
                System.out.print("What is the age of person " + (colIndex + 1) + "?   :  ");
                houseAges[rowIndex][colIndex] = keyboard.nextInt();

            } // end of the inner for loop --> COLUMN
            System.out.println(" ");

        } // end of the outer for loop --> ROW

        // COUNTING

        int totalAge = 0;
        int streetAge = 0;

        for (rowIndex = 0; rowIndex < houseAges.length; rowIndex++) {



            for (colIndex = 0; colIndex < houseAges[rowIndex].length; colIndex++) {

                totalAge = totalAge + houseAges[rowIndex][colIndex];

            } // end of the inner for loop --> COLUMN
            System.out.println("House " + (houseNumbers[rowIndex]) + " has a total age of " + totalAge);
            streetAge = streetAge + totalAge;
            totalAge = 0;

        } // end of the outer for loop --> ROW
        System.out.println("The street has a total age of " + streetAge);






    } // End of the main method


} // end of the StreetMaintenanceDurban Class
