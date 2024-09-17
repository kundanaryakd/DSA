package Numbers;

public class CountDigit {

    public static void main(String[] args) {
        int num = 835352;
        System.out.println(countDigit(num));

    }
    public static int countDigit(int number) {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

}
