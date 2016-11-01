
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gavra1870
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        //Gather the data
        Scanner input = new Scanner(System.in);
       // ask the user for theri name
        System.out.println("Print you name");
             String name = input.nextLine();
       //ask the user what the test was out of 
        System.out.println(" Please print what the test was out of");
        double test1 =0; 
               test1 =input.nextInt();
       //ask the user what mark he or she got on the test 
        System.out.println("Please print the mark you got on the first test");
        double mark1 =0;
               mark1 = input.nextInt();
       //calculate the percentage of the of the first test 
        double percent1 = (mark1 / test1)*100;
        System.out.println("The precentage that you got on the test is " + percent1);
        
        
        
        //ask the user what the second test was out of 
        System.out.println(" Please print what the  seocond test was out of");
        double test2 =0; 
               test2 =input.nextInt();
       //ask the user what mark he or she got on the second test 
        System.out.println("Please print the mark you got on the second test");
        double mark2 =0;
               mark2 = input.nextInt();
       //calculate the percentage of the of the of the second test
        double percent2 = (mark2 / test2)*100;
        System.out.println("The precentage that you got on the test is " + percent2);
        
        
       //ask the user what the third test was out of 
        System.out.println(" Please print what the  third test was out of");
        double test3 =0; 
               test3 =input.nextInt();
       //ask the user what mark he or she got on the third test 
        System.out.println("Please print the mark you got on the third test");
        double mark3 =0;
               mark3 = input.nextInt();
       //calculate the percentage of the of the third test
        double percent3 = (mark3 / test2)*100;
        System.out.println("The precentage that you got on the test is " + percent3);
        
        
        //ask the user what the fourth test was out of 
        System.out.println(" Please print what the fourth test was out of");
        double test4 =0; 
               test4 =input.nextInt();
       //ask the user what mark he or she got on the fourth test 
        System.out.println("Please print the mark you got on the third test");
        double mark4 =0;
               mark4 = input.nextInt();
       //calculate the percentage of the of the fourth test
        double percent4 = (mark4 / test4)*100;
        System.out.println("The precentage that you got on the test is " + percent4);
        
        
          //ask the user what the fifth test was out of 
        System.out.println(" Please print what the fifth test was out of");
        double test5 =0; 
               test5 =input.nextInt();
       ///ask the user what mark he or she got on the fifth test 
        System.out.println("Please print the mark you got on the fifth test");
        double mark5 =0;
               mark5 = input.nextInt();
       ///calculate the percentage of the of the fourth test
        double percent5 = (mark5 / test4)*100;
        System.out.println("The precentage that you got on the test is " + percent5);
        
        double average =0;
        //calculate the results for all of the test
               average = (mark1+mark2+mark3+mark4+mark5)/(test1+test2+test3+test4+test5)*100;
               System.out.println("The average in your mark is" +average);
               
               
               
               
               
        
        
        
        
      
        
        
        
    }
}
