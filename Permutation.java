package Array;

public class Permutation {
    public boolean permutation(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        int sum1 = 0;
        int sum2 = 0;
        int mal1 = 1;
        int mal2 = 1;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
            mal1 *= array1[i];
            mal2 *= array2[i];
        }
        if (sum1 == sum2 && mal1 == mal2) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Permutation ex = new Permutation();
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 1, 2, 3, 4};
        System.out.println(ex.permutation(array1, array2));
    }

}

