package Array;

public class FindLargest {

    public static void main(String[] args) {

        int [] arr = {3,5,6,8,9,7};
        int largest = arr[0];

        for(int i = 0; i<arr.length;i++){

            if(arr[i]>largest){
                largest=arr[i];
            }

        }
        System.out.println("The Largest Number in Array is "+largest);
    }
}
