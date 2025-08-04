package CODING_NINJA_SOLUTIONS;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");

        int num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num)
	{
	   

		int count= (int) Math.log10(num) +1;

		int n=num;
		int res=0;
		while(n!=0)
		{
			int dig=n%10;
			res+=Math.pow(dig,count);
			n/=10;
		}

		if(res==num)
		{
			return true;
		}
		else
		{
			return false;
		}
}
}

// Time Complexity: O(d), where d is the number of digits in num
// Space Complexity: O(1), uses constant extra space