
package day;

import java.util.Scanner;


public class Day {

    public static void main(String[] args) {
        
 
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number from 1 to 7: ");
        int n=in.nextInt();
         
        switch (n){
            case 1:
            {
                System.out.println("weekday = saturday");
                break;
            }
            case 2:
            {
                System.out.println("weekday = sunday"); 
                break;

            }
            case 3:
            {
                System.out.println("weekday = monday");
                break;
            }
            case 4:
            {
                System.out.println("weekday = tuseday");
                break;
            }
            case 5:
            {
                System.out.println("weekday = wednesday");
                break;
            }
            case 6:
            {
                System.out.println("weekday = thusday");
                break;
            }
            case 7:
            {
                System.out.println("weekday = friday");
                break;
            }
            default:
                System.out.println("invaid input");
                
        }
    }
}
  