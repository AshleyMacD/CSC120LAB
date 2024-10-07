import java.util.Scanner;

public class NitroxScuba {

    private static final Scanner keyboard = new Scanner(System.in);

    public static double FTPERATM = 33;
    public static double MAXIMUMPTPO2 = 1.4;
    public static double MAXIMUMCONTO2 = 1.6;
    public static void main(String[] args) {
        System.out.println("WEEK 4 - LAB 3");

        System.out.print("Enter depth : ");
        double diveDepth = keyboard.nextDouble();
        System.out.print("Enter percentage O2 : ");
        double percentO2 = keyboard.nextDouble();

        double ambientPressure = ((diveDepth / FTPERATM) + 1);
        double partialPressure = ((percentO2 / 100) * ambientPressure);



        char o2Group = (char)((int)(partialPressure * 10) + (int)'A');
        boolean exceedMaxO2Pressure;
        boolean exceedMaxContingencyPressure;


        if (partialPressure > MAXIMUMPTPO2) {
            exceedMaxO2Pressure = true;


        } else {
            exceedMaxO2Pressure = false;

        }

        if (partialPressure > MAXIMUMCONTO2) {
            exceedMaxContingencyPressure = true;


        } else {
            exceedMaxContingencyPressure = false;

        }

        System.out.println("Ambient pressure : " + ambientPressure);
        System.out.println("O2 pressure : " + partialPressure);
        System.out.println("O2 group : " + o2Group);
        System.out.println("Exceeds maximal O2 pressure : " + exceedMaxO2Pressure);
        System.out.println("Exceeds contingency O2 pressure : " + exceedMaxContingencyPressure);



    } // End of the main method






}
// End of the class NitroxScuba
