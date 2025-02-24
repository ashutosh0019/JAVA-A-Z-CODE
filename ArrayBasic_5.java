public class ArrayBasic_5 {
    public static void main(String[] args) {
        System.out.println("Java program to find the average of elements in an array");

        int arr [] = {1,2,3,4,5,6};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+",");
            sum = arr[i]+sum;          
            
        }

        int len = arr.length;

        float avg = sum / len;

        System.out.println(" average of the element is : "+avg);
       
    }
}
