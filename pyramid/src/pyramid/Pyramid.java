
package pyramid;

import java.util.Scanner;
public class Pyramid {

   
    public static void main(String[] args) {
      Scanner in =new Scanner(System.in);
      System.out.print("Enter a number : ");
      int n = in.nextInt( );
      
    for(int i=0;i<=n;i++)
        {
          for(int j=0;j<=n-i;j++)
          
          {
              System.out.print(" ");
          }
          
        for(int k=0;k<=i;k++)
        
        {
            System.out.print(i+" ");
        }
             System.out.println(" ");
         
    
         }
    
 }
}

