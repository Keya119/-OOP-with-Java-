
package sumodd;

import java.util.Scanner;
public class Sumodd {

    
    public static void main(String[] args) {
       
       

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		System.out.print("The N odd natural numbers are: ");
		int sum = 0;

		for(int i=1;i<=n;i+=2) 
                {
			System.out.println(i);
			sum +=i;
		}
		System.out.println(" Sum of N odd num:"+sum);
	}
}