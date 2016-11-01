
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gavra1870
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //ask the user of how many mintues he get during daytime
        System.out.println(" State the number of daytime in minutes");
        double dmin = input.nextDouble();

        //ask the user of how many mintues he get during evening
        System.out.println(" State the number of evening in mintues");
        double emin = input.nextDouble();

        //ask the user of how many mintues he get during the weekend
        System.out.println(" State the number of daytime in minutes");
        double wmin = input.nextDouble();

        //Find each price for daytime, evening, and weekend using plan A
        double admin = (dmin - 100) * (0.25);
        double bemin = (emin * 0.15);
        double cwmin = (wmin * 0.20);
        // and the prices together to find the total cost, and weekend us
        double ddmin = (dmin - 250) * (0.45);
        if (ddmin < 0) {
            ddmin = 0;

        }
        double eemin = (emin * 0.35);
        double fwmin = (wmin * 0.25);

        //add the prices together to find the total cost for the plan B
        double totalforPlanB = (ddmin + eemin + fwmin);
        System.out.println("Plan B costs" + totalforPlanB);
        System.out.println("Plan B is the cheapest");

    }
}
