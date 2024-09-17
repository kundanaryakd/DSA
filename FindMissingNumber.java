package Array;

//Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.
//
//Example
//
//myArray = {1,2,3,4,6}
//findMissingNumberInArray(myArray, 6) // 5
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] MyArray = {1, 2, 3, 4, 6};
        System.out.println(findMissingNumberInArray(MyArray));

    }

    public static int findMissingNumberInArray(int[] array) {
        int n = array.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int number : array) {
            actualSum += number;
        }

        return expectedSum - actualSum;
    }
}


