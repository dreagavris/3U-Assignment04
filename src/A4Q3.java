
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gavra1870
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        //ask for user to print for numbers into the system on seprate lines
        double number = 0;
        System.out.println(" Please print four numbers ");
        number = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double number4 = input.nextDouble();
        //Repeat the numbers that the user typed in
        System.out.println("The number that u type are" + number + ", " + number2 + ", " + number3 + ", " + number4); 




    }
}
