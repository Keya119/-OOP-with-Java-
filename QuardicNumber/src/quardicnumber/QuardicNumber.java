
package quardicnumber;

import java.util.Scanner;

public class QuardicNumber {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
           
            System.out.print("Enter a: ");
            double a = input.nextDouble();
            System.out.print("Enter b: ");
            double b = input.nextDouble();
            System.out.print("Enter c: ");
            double c = input.nextDouble();
            
        double x = ( b*b-4*a*c);
        if(x>0)
           {
              double x1 = (- b+ Math.sqrt(x)) /(2*a);
              double x2 = (-b - Math.sqrt(x)) / (2*a);
                
               System.out.println("The quadretic are " + x1);
               System.out.println("The quadretic are " + x2);
     
         }
        else if (x == 0)
        {
                double x1 = -b / (2*a);
                System.out.println("The root is " + x1);
            }
        
            else {
                System.out.println("The equation has no real roots");
            }
           
            
 }
    
}
