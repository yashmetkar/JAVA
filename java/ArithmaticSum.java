// implementing the formula to calculate the formula to calculate the sum of any 
//       given arithmetic progression

import java.util.Scanner;
public class ArithmaticSum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("First number:");
            int a = sc.nextInt();
            System.out.println("Comman diff :");
            int d = sc.nextInt();
            System.out.println("Number count:");
            int n = sc.nextInt();
            int total = a;
            for( int i=1; i<n ; i++)
            {
                a+=d;   /*Store the next number of variable 'a' */
                total+=a;
            }
            System.out.println("Total:"+total);
            System.out.println();
        }
    }
    
}

          /*  Sn = n[ 2a+(n-1)d]/2

              n = number of terms to add
              a = first term in the progression
              d = Common difference
              Sn = Sum of 'n' terms
              
              Sum = n*(2*a+(n-1)*d)/2;
           */