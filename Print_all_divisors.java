package CODING_NINJA_SOLUTIONS;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Print_all_divisors {
	
	// Write your printDivisor function here
	public static void printDivisor(int n)
	{
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=1;i*i<=n;i++)
		{
			if(n%i==0)
			{
				al.add(i);
				if((n/i)!=i)
				{
					al.add(n/i);
				}
			}
		}
		Collections.sort(al);
		for(int i:al)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void main(String args[]) {
		// Taking input from user
        System.out.print("Enter a number to print its divisors: ");
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		printDivisor(n);
        sc.close();
	}
}


// Time Complexity: O(sqrt(n)) for finding divisors + O(k log k) for sorting, where k is the number of divisors
// Space Complexity: O(k), where k is the number of divisors stored in the list
