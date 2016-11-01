
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gavra1870
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        //ask the user to print the cost of the food 
        int food = 0;
        System.out.println("Please print the cost of the food");
            food = input.nextInt();
        //ask the user to print the cost of the Dj
        int Dj = 0;
        System.out.println("Please print the cost of the Dj");
            Dj = input.nextInt();
         //ask the user to print the cost of the renting the hall 
        int rent = 0;
        System.out.println("Please print the cost renting the hall");
            rent = input.nextInt();
         //ask the user to print the cost of the decorations
        int decorations = 0;
        System.out.println("Please print the cost of the decorations");
            decorations = input.nextInt();
         //ask the user to print the cost for hiring the staff
        int staff = 0;
        System.out.println("Please print the cost for hiring the staff");
            staff = input.nextInt();
            //ask the user to print the costof the miscellaneous
        int miscellaneous = 0;
        System.out.println("Please print the cost of the miscellaneous");
            miscellaneous  = input.nextInt();
            double total = food + Dj + rent + decorations + staff + miscellaneous;
        System.out.println("The total cost of the event is " + total);
            //Determine how many ticketes are needed to be sold in order to break the total cost

            System.out.println(" Please print the cost of the tickets");
                   double costoftickets = input.nextInt();
                   double tickets = total/costoftickets;
                   
            //state the amount of tickets that are needed in order break the initial cost
            System.out.println("The amount of ticketes that are needed to break even is " + tickets );
            
        
        
    }
}
