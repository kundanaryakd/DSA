package Pattern;

public class DimondPattern {

    public static void main(String[] args) {
        int row = 4;
         //Uper code
        for(int i = 1; i<=row; i++){

            // Space
            for(int j=1; j<=row-i;j++){

                System.out.print(" ");
            }
              // Star Printing
            for(int j=1; j<=2*i-1;j++){

                System.out.print("*");

            }
            System.out.println();

        }
        // Lower code
        for(int i = row; i >=1; i--){
            // Space
            for(int j = 1; j<=row-i;j++){

                System.out.print(" ");
            }
            // Star Printing
            for(int j = 1; j<=2*i-1;j++){

                System.out.print("*");

            }
            System.out.println();

        }

    }
}
