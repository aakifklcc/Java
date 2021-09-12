
package homework;

import java.util.Scanner;

public class Question_3 {
     public static void main(String[] args) {
        // TODO code application logic here

        int x,y,z;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 integers:");
         x = s.nextInt();
         y = s.nextInt();
         z = s.nextInt();
        
        int sumofx=1;
         for (int i = x; i <= 5; i++) {
            sumofx*=i;
            
         }
         
        int sumofsecondpart=0;
         for (int j = y; j <= 10; j++) {
             for (int k = z; k <= 5; k++) {
                      sumofsecondpart+=(j-2*k);
             }
         }
        
         int totalsum=sumofx+sumofsecondpart;
         System.out.println(totalsum);
         
    
     }
}
