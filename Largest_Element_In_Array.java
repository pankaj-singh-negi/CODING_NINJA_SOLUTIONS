package CODING_NINJA_SOLUTIONS;

import java.util.Scanner;

public class Largest_Element_In_Array {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter " + n + " elements:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    int largest = findLargest(arr);
    System.out.println("The largest element in the array is: " + largest);
    sc.close();
}

    private static int findLargest(int[] arr) {
       int max=arr[0];
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>max)
        {
            max=arr[i];
        }
    }
    return max;
    }
}

// Time Complexity: O(n), where n is the number of elements in the array
// Space Complexity: O(1), uses constant