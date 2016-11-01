
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gavra1870
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
   
         
        //Create a input for the user
        public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in); 
        //Ask user for a mearurment in inches 
        int number = 0;
        System.out.println("Print a measurment in Inches");
        number = input.nextInt();
        double measurement = number * 2.54;
        System.out.println( "Print measurement" + measurement);
    }
}
