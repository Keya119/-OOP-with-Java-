
package diamond;

import java.util.Scanner;

public class Diamond {

    
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = in.nextInt();

		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n-i; j++)

			{
				System.out.print(" ");
			}

			for (int j=0; j<=i; j++)

			{
				System.out.print("* ");
			}
			System.out.println(" ");


		}
		for (int i=n-1; i>=0; i--)
		 {
			for (int j=0; j<=n-i; j++)

			{
				System.out.print(" ");
			}

			for (int j=0; j<=i; j++)

			{
				System.out.print("* ");
			}
			System.out.println(" ");


		}

    }
    
}