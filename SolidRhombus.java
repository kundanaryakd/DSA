package Pattern;

public class SolidRhombus {

    public static void main(String[] args) {

        int row = 5 ;

        for(int i = 1; i <=row; i++){

            // Printing Space
            for(int j = 1;j<=row-i;j++){
                System.out.print(" ");
            }
            // Printing Star
            for(int j = 1; j<=row; j++){

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
