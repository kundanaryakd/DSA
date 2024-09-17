package Array;

public class IsSorted {

    public static boolean CheckisSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(CheckisSorted(arr)); // true

        arr = new int[]{1, 5, 3, 2, 4};
        System.out.println(CheckisSorted(arr)); // false
    }
}

