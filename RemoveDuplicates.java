package Array;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 4, 3, 5, 3, 3};

        // Sort the array
        Arrays.sort(arr);

        // Remove duplicates
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        // Print the unique elements
        for (int j = 0; j <= i; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
