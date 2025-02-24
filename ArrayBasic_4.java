public class ArrayBasic_4 {
    public static void main(String[] args) {
        System.out.println("Java program to calculate the sum of all elements in an array");

        int arr [] = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]+" + ");
            sum = sum + arr[i];
        }

        System.out.println("sum of all element is : "+sum);
    }
}
