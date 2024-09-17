package String;
public class IntegerReverse {

        public static void main(String[] args) {

            int num =12345;
            String reverse = "";

            String rev = Integer.toString(num);

            for(int i= rev.length()-1;i>=0;i--){

                reverse+= rev.charAt(i);

            }
            int numReverse = Integer.parseInt(reverse);
            System.out.println(numReverse);




        }
    }


