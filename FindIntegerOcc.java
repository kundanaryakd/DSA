package Numbers;
public class FindIntegerOcc {


    public static void main(String[] args) {
        int number = 1234567854;
        int find = 5;
        int count = 0;

        String NumberAsString = Integer.toString(number);
        for(int i = 0; i<NumberAsString.length();i++){

            if(Character.getNumericValue(NumberAsString.charAt(i)) == find){
                count++;

            }

        }
        System.out.println("The Integer " + find + " occured >> " + count + " Times " );
    }


}
