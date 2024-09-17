package Array;

//Given 2D array calculate the sum of diagonal elements.
//myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
//sumDiagonalElements(myArray2D) # 15

public class FindSumIn2dArray {

    public static void main(String[] args) {
        int [] [] myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumDiagonalElements(myArray2D));
    }

        public static int sumDiagonalElements(int[][] array) {
            int sum = 0;
            int numRows = array.length;

            for (int i = 0; i < numRows; i++) {
                for(int j = 0;j<numRows;j++){
                    sum+= array[i][j];
                }
            }

            return sum;
        }
    }
