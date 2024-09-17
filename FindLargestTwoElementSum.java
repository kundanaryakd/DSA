package Array;

import java.util.Arrays;

public class
FindLargestTwoElementSum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int largestSum = findLargestSum(array);
        System.out.println("The largest sum of two numbers in the array is: " + largestSum);
    }

    public static int findLargestSum(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        // Step 1: Sort the array
        Arrays.sort(array);

        // Step 2: Find the two largest numbers
        int n = array.length;
        int largest1 = array[n - 1];
        int largest2 = array[n - 2];

        // Step 3: Return the sum of the two largest numbers
        return largest1 + largest2;
    }
}
