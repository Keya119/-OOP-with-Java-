
package sumavarage;

import java.util.Scanner;
public class SumAvarage {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter 5 numbers: ");

	    int sum = 0;

		for (int i = 1; i<=5;i++)
                {
           
                  int n = sc.nextInt();
                  sum = sum + n;
		}
		System.out.println("Sum of 5 num=" + sum);
		
		System.out.println("The Avarage="+sum/5);
        }
    
    
}

    
    

