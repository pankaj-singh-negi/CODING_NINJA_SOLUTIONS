package CODING_NINJA_SOLUTIONS;

import java.util.Scanner;

public class Power_of_a_Number {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate its power: ");
        int n = sc.nextInt();
         System.out.print("Enter the power to which the number is raised: ");
        int pow = sc.nextInt();
       

        System.out.println("Resultant Number is:"+ power(n, pow));
    }


    // Function to calculate power of a number:Using Brute Force
    //Time Complexity: O(pow)
    //Space Complexity: O(1)
    // private static double power(int n, int pow) {
    //   int res=1;
    //   for(int i=1;i<=pow;i++)
    //   {
    //       res=res*n;
    //   }

    //   return res;
    // }

    //

    //Function to calculate power of a number:Using Fast Exponentiation
    //Time Complexity: O(log(pow))
    //Space Complexity: O(1)
    private static double power(int n, int pow) {
      double res=1;
        if (pow == 0) {
            return 1;
        }
        while(pow>0)
        {
          if(pow%2!=0)
          {
            res = res * n;
            pow = (pow - 1)/2;
          }
          else{
            pow=pow/2;
          }
          n=n*n;
        }
        return res;
    }
}
