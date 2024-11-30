
package checknumber;

import java.util.Scanner;
public class Checknumber {

   
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int number = in.nextInt();
        
        if(number>0)
        {
            System.out.println("Positive");
        }
        else if(number<0)
        {
            System.out.println("Negetive");
        }
        else{
            System.out.println(Zero);
        }
    }
    
}
