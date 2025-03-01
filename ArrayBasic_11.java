import java.util.Arrays;

public class ArrayBasic_11 {
    public static void main(String[] args) {
        System.out.println("Java program to find the second largest and second smallest element in an array");

        int arr[] = {1,2,3,14,5,6,7,8};
        Arrays.sort(arr);
        int largest_element = arr[arr.length-1];
        int smallest_element = arr[0];
        System.out.println(largest_element+" "+smallest_element);

        int second_largest_element = arr[arr.length-2];
        int second_smallest_element = arr[1];
        System.out.println(second_largest_element+" "+second_smallest_element);
        
        
    }
}
