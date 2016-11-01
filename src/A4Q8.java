
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gavra1870
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner 
        Scanner input = new Scanner(System.in);
        double sum = 1;
        while (sum < 100){ 
        //ask for  sum of dice
        System.out.println("Enter the sum of the number");
        double num = input.nextDouble();
        //if the sum of the dice is zero
        if (num == 0) {
            System.out.println("Your Quit!");
        }
        sum = num + sum;
        //Tell the user where they will end up when landing on a snake.

        if (sum == 54) {
            sum = 19;
        }
        if (sum == 90) {
            sum = 48;
        }
        if (sum == 99) {
            sum = 77;

        }
        //Tell the user where they will end up when landing on a ladder

        if (sum == 9) {
            sum = 34;
        }
        if (sum == 40) {
            sum = 64;
        }
        if (sum == 67) {
            sum = 86;
        }
    
        // Tell the user what sqaure they are on 
        System.out.println(" You are on square" + sum );
        //answers
        if (sum == 100){
            System.out.println("Congratulations you won");
        
    }
    }
    }
    
}
