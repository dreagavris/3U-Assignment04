
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gavra1870
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input 
        Scanner input = new Scanner(System.in);

        // ask the user to put the speed limit 
        System.out.println("Enter the first speed limit ");
        double sl = input.nextInt();
        //ask the user to put the recorded speed of the car
        System.out.println("Enter in the first recorded speed of the car");
        int rs = input.nextInt();

       //calculate the fine for 1-20
       //over the limit 1-20
        double Ff = 100;
        if (sl > rs) {
            System.out.println("Congratulations, you are within the speed limit");
        }
        
        if (sl + 20 < rs && rs < sl) {
            System.out.println(" Your speed is over the limit and the fine is " + Ff);
        }
        //calculate the fine for 21-30
        double Sf = 270;
       if (sl + 30 < rs && rs < sl + 21){
           System.out.println(" Your speed is over the limit and the fine is " + Sf);    
       }
       //claculate the fine for 31+
       double Tf = 500;
       if (sl + 30 < rs){
           System.out.println(" Your speed is over the limit and the fine is " + Tf);
    }
}
}


