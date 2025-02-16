package Array;


// Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.
//
//myArray = [1, 2, 3, 4]
//middle(myArray)  # [2,3].


import java.util.Arrays;

public class MiddleFunction {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4};

        int[] arr = middle(myArray);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] middle(int[] array) {
        if (array.length <= 2) {
            return new int[0];
        }


        int[] middleArray = new int[array.length - 2];


        int index = 1;
        while (index < array.length - 1) {
            middleArray[index - 1] = array[index];
            index++;
        }

        return middleArray;
    }
}

