import java.util.Scanner;
public class TaxCalculator {

    private static final Scanner keyboard = new Scanner(System.in);
    private static final double STINKINGRICH = 500000;
    private static final double QUITERICH = 200000;
    private static final double MIAMIPOOR = 100000;
    private static final double AVERAGE = 50000;
    private static final double REALISTIC = 20000;
    private static final double HIGHRATE = .25;
    private static final double MEDIUMRATE = .10;
    private static final double LOWRATE = .03;


    public static void main(String[] args) {
        System.out.println("WEEK 5 - LAB 4");

        double income = 0;
        double deductions = 0;

        System.out.print("Enter next amount : ");
        double inputValue = keyboard.nextDouble();

        while (inputValue != 0.0) {

            if (inputValue > 0.0) {
                income = income + inputValue;

            } else if (inputValue < 0.0) {
                deductions = deductions + (inputValue * -1);

            }
            System.out.print("Enter next amount : ");
            inputValue = keyboard.nextDouble();



        }


        double taxableIncome;
        taxableIncome = computeTaxableIncome(income, deductions);
        char letterGroup;
        letterGroup = chooseTaxGroup(taxableIncome);
        double taxAmount;
        taxAmount = computeTax(taxableIncome, letterGroup);
        displayTaxInformation(income, deductions, taxableIncome, letterGroup, taxAmount);





    } // End of the main method

    private static double computeTaxableIncome(double income, double deductions) {
        double taxable;
        if (income >= deductions) {
            taxable =  income - deductions;
        } else {
            taxable =  0.0;
        }
        return taxable;




    } // End of computeTaxableIncome method

    private static char chooseTaxGroup (double income) {
        char taxGroup;
        if (income >= STINKINGRICH) {
            taxGroup = 'S';
        } else if (income >= QUITERICH) {
            taxGroup = 'Q';
        } else if (income >= MIAMIPOOR) {
            taxGroup = 'M';
        } else if (income >= AVERAGE) {
            taxGroup = 'A';
        } else if (income >= REALISTIC) {
            taxGroup = 'R';
        } else {
            taxGroup = 'P';
        }

        return taxGroup;


    } // End of chooseTaxGroup method

    private static double computeTax(double taxable, char group) {
        double tax;
        double taxAmount;

        if (group == 'S' || group == 'Q') {
            tax = HIGHRATE;
            taxAmount = taxable * tax;
        } else if (group == 'M') {
            tax = MEDIUMRATE;
            taxAmount = taxable * tax;
        } else if (group == 'A' || group == 'R')  {
            tax = LOWRATE;
            taxAmount = taxable * tax;
        } else if (group == 'P') {
            tax = 0.0;
            taxAmount = taxable * tax;
        } else {
            taxAmount = 0.0;
            System.out.println("Error!");

        }



        return (taxAmount);



    }

    private static void displayTaxInformation(double income, double deductions, double taxableIncome, char group, double taxOwed) {
        System.out.println("Income = $" + income);
        System.out.println("Deductions = $" + deductions);
        System.out.println("Taxable Income = $" + taxableIncome);
        System.out.println("Tax Group = $" + group);
        System.out.println("Tax Owed = $" + taxOwed);


    }






}
