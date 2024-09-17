package String;

public class StringOccurance {

    public static void main(String[] args) {
        String str = "House is blue and gate is blue";
        String substr = "blue";
        int count = 0;
        int index = str.indexOf(substr);

        while(index != -1){
            count++;
            index = str.indexOf(substr,index+1);
        }

        System.out.println("Substring " + substr + " occurs >> "+ count + " times");
    }
}
