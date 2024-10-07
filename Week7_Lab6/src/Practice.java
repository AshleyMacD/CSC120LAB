import java.util.Scanner;
public class Practice {
    private static final Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Practice Arrays");

        // Declaring an Array
        int [] myArray = new int[3];

        // Declaring 2D Array
        int [][] yourArray = new int[3][2];

        // Update Array
        int rowIndex;
        int colIndex;

        for (rowIndex = 0; rowIndex < yourArray.length; rowIndex++) {

            for (colIndex = 0; colIndex < yourArray[rowIndex].length; colIndex++) {
                System.out.print("At index [" + rowIndex + "] [" + colIndex + "] Enter a number: ");
                yourArray[rowIndex][colIndex] = keyboard.nextInt();

            } // end of the inner for loop --> COLUMN

        } // end of the outer for loop --> ROW

        // DISPLAY
        for (rowIndex = 0; rowIndex < yourArray.length; rowIndex++) {

            for (colIndex = 0; colIndex < yourArray[rowIndex].length; colIndex++) {
                System.out.println("At index [" + rowIndex + "] [" + colIndex + "] the value is: " + yourArray[rowIndex][colIndex]);

            } // end of the inner for loop --> COLUMN

        } // end of the outer for loop --> ROW



    } // End of the main method

    private static void updateMyArray(int [] myArray) {
        // Updating the Array
        int index;
        for (index = 0; index < myArray.length; index++) {
            System.out.print("At index [" + index + "], Enter a number: ");
            myArray[index] = keyboard.nextInt();
        } //End of the for loop


        // Display the array
        System.out.println("DISPLAY THE CONTENT OF THE ARRAY");
        for (index = 0; index < myArray.length; index++) {
            System.out.println("At index [" + index + "], The value is: " +  myArray[index]);
        } //End of the for loop


    }

} // End of the Practice Class
