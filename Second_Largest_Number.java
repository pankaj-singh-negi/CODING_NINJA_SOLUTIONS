package CODING_NINJA_SOLUTIONS;

import java.util.Scanner;

public class Second_Largest_Number {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Create an array of size n
        int[] arr = new int[n];

        // Prompt user to enter array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get second largest and second smallest elements
        int[] res = getSecondOrderElements(n, arr);

        // Display results to the user
        if (res[0] == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in the array.");
        } else {
            System.out.println("Second largest element: " + res[0]);
        }
        if (res[1] == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element in the array.");
        } else {
            System.out.println("Second smallest element: " + res[1]);
        }
        sc.close();
    }

    /**
     * Returns an array containing the second largest and second smallest elements.
     * @param n Size of the array
     * @param arr Input array
     * @return int[] where res[0] is second largest, res[1] is second smallest
     *
     * Time Complexity: O(n), where n is the number of elements in the array
     * Space Complexity: O(1), uses constant extra space
     */
    public static int[] getSecondOrderElements(int n, int[] arr) {
        int[] res = new int[2];
        res[0] = findSecondLargest(arr);   // Second largest element
        res[1] = findSecondSmallest(arr);  // Second smallest element
        return res;
    }

    /**
     * Finds the second largest element in the array.
     * @param arr Input array
     * @return Second largest element, or Integer.MIN_VALUE if not found
     */
    private static int findSecondLargest(int[] arr) {
        int firstMax = Integer.MIN_VALUE;   // Largest value found so far
        int secondMax = Integer.MIN_VALUE;  // Second largest value found so far

        for (int i = 0; i < arr.length; i++) {
            // If current element is greater than firstMax, update both firstMax and secondMax
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            }
            // If current element is between firstMax and secondMax, and not equal to firstMax
            else if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
            }
        }
        // If secondMax is still Integer.MIN_VALUE, there was no valid second largest
        return secondMax;
    }

    /**
     * Finds the second smallest element in the array.
     * @param arr Input array
     * @return Second smallest element, or Integer.MAX_VALUE if not found
     */
    private static int findSecondSmallest(int[] arr) {
        int firstMin = Integer.MAX_VALUE;   // Smallest value found so far
        int secondMin = Integer.MAX_VALUE;  // Second smallest value found so far

        for (int i = 0; i < arr.length; i++) {
            // If current element is smaller than firstMin, update both firstMin and secondMin
            if (arr[i] < firstMin) {
                secondMin = firstMin;
                firstMin = arr[i];
            }
            // If current element is between firstMin and secondMin, and not equal to firstMin
            else if (arr[i] < secondMin && arr[i] != firstMin) {
                secondMin = arr[i];
            }
        }
        // If secondMin is still Integer.MAX_VALUE, there was no valid second smallest
        return secondMin;
    }
}