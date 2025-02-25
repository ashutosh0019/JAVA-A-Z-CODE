public class ArrayBasic_7 {
    public static void main(String[] args) {
        System.out.println("Java program to copy elements from one array to another");

        int arr [] = {1,2,3,4,5,6,7,8,9};
        int arrcopy[] = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            arrcopy [i] = arr[i];

        }
        for(int i = 0; i<arrcopy.length; i++){
            System.out.println(arrcopy[i]);
        }
    }
}