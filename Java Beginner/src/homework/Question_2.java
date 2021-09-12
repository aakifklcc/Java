
package homework;

import java.util.Scanner;

public class Question_2 {

    public static void main(String[] args) {
        // TODO code application logic here

        int i, k, n, j, l, m;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an even number:");
        n = s.nextInt();
        
        if(n%2==0) {
        for (i = 1; i <= n; i++)
        {
            for (k = n; k > i; k--)//here for an empty are aroun the numbers
            {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++)// and printing the numbers
            {
                System.out.print(j + " ");
            }
            System.out.println();
            
        }
        
        } else {
            System.out.println("Enter an even number."); 
        }
       
    }
}
