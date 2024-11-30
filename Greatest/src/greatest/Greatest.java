
package greatest;

import java.util.Scanner;

public class Greatest {

    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
     
       System.out.print("Enter a : ");
       int a = input.nextInt();
       System.out.print("Enter b : ");
       int b = input.nextInt();
       System.out.print("Enter c : ");
       int c = input.nextInt();

        if( a > b && a > c)
            
            System.out.println(" The greatest number " +a );

        else if (b > a && b > c)
            System.out.println("The greatest number " +b);

        else
            System.out.println(" The greatest number " +c);
   

    }
    
}
