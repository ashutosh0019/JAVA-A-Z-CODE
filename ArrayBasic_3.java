public class ArrayBasic_3 {
    public static void main(String[] args) {
        System.out.println("Java program to find the smallest element in an array");

        int arr [] = {10,12,13,4,15,6};

        int min = arr[0];

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("smallest elemnet in array is : "+min);
    }
}
