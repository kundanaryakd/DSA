package Pattern;

public class PalinedromePyramid {

    public static void main(String[] args) {

        int row = 5;

        for(int i = 1; i <=row;i++){

            //Spaces
            for(int j = 1; j<=row-i; j++){
                System.out.print(" ");
            }
            // 1st half numbers
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            //2nd Half
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }


    }
}
