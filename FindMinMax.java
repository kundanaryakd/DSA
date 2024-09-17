package Array;

public class FindMinMax {

    public static void main(String[] args) {
        int[] myArray = {1, 4, 7, 66, 44, 23, 88};

        System.out.println("Min num in Array is: " + findMinNum(myArray));
        System.out.println("Max num in Array is: " + findMaxNum(myArray));
    }
    public static int findMinNum(int[] myArray) {
        int minNum = Integer.MAX_VALUE;

        for (int num : myArray) {
            if (minNum > num) {
                minNum = num;
            }
        }

        return minNum;
    }
    public static int findMaxNum(int[] myArray) {
        int maxNum = Integer.MIN_VALUE;

        for (int num : myArray) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }
}
