package Pattern;

public class ButterFly {

    public static void main(String[] args) {
        int row = 4;

          //Upper Half
        for(int i =1; i<=row;i++){

            //1st Part
            for(int j = 1; j<=i; j++){

                System.out.print("*");
            }
            // 2nd Step
            int spaces = 2 * (row-i);
            for(int j = 1; j<=spaces;j++){

                System.out.print(" ");
            }
            // 3rd Part
            for(int j =1; j<=i; j++){
                System.out.print("*");

            }
            System.out.println();
        }
        //Lower half
        for(int i =row; i>=1;i--){
            //1st Part
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // Spaces
            int spaces = 2 * (row-i);

            for(int j = 1; j<=spaces;j++){

                System.out.print(" ");
            }
            // 2nd Part
            for(int j =1; j<=i; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
