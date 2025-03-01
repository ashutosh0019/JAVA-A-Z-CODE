import java.util.Arrays;

public class ArrayBasic_12 {
    public static void main(String[] args) {
        System.out.println("Java program to remove duplicates from an array.");

        int arr[] = {1,2,2,3,4,1,3,6,4,5,6,7,7,8,9};

        Arrays.sort(arr);
        System.out.print("Array after removing duplicates: ");
        System.out.print(arr[0] + " ");

        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
