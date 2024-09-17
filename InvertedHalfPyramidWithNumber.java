package Pattern;

public class InvertedHalfPyramidWithNumber {

    public static void main(String[] args) {
        int row = 5;
        int count = 15;

        for(int i = 1; i<=row;i++){

            for(int j=1; j<=row -i+1;j++){
                System.out.print(count+" ");
                count--;
            }

            System.out.println();
        }
    }
}
