package Array;

import java.util.Arrays;

public class IsUnique {
    public static void main(String[] args) {
        IsUnique unique = new IsUnique();
        int[] myArray = {1, 2, 3, 4, 5, 6,};
        System.out.println(unique.isUnique(myArray));

    }

    public boolean isUnique(int[] myArray) {

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    return false;
                }
            }
        }
        return true;

    }

}

