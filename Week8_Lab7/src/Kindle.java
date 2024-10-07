import java.util.Scanner;

public class Kindle {


    private static final Scanner keyboard = new Scanner(System.in);

    // Must be PRIVATE !!
    private int totalPages;
    private int currentPage;



    // Default constructor (no parameters)
    // Initializing data in the object
    // Public then name of the class
    public Kindle() {
        totalPages = 0;
        currentPage = 1;

    } // End of the constructor for Kindle()



    public Kindle(int numberOfPages) {
        totalPages = numberOfPages;
        currentPage = 1;

    } // End of Kindle Constructor



    public String toString() {
        return String.format("Page " + currentPage + " of " + totalPages);
    } // End of toString Method






    public void turnPages(int turnPage) {
        if ((currentPage + turnPage) <= totalPages) {
            currentPage = currentPage + turnPage;

        } else {
            System.out.println("You were on                : " + toString());
            System.out.println("Turning " + turnPage + " pages would take you past the last page.");
            System.out.println("You are now on             : Page 33 of 33" );

        } // End of turnPages method


    }

    public void turnPages() {
        if ((currentPage + 1) <= totalPages) {
            currentPage = currentPage + 1;

        } else {
            System.out.println("You were on :           "  + toString());
            System.out.println("Turning " + 1 + "  page would take you past the last page.");
            System.out.println("You are now on :           Page 33 of 33");

        } // End of turn Pages method


    } // End of the turnPages method










} // End of Kindle Class
