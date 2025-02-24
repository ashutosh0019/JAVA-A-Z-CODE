public class ArrayBasic_2 {
    public static void main(String[] args) {
        System.out.println("Java program to find the largest element in an array.");

        int arr [] = {1,2,3,4,45,6,7,8,9};

        int max = arr[0];

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(arr[i]>max){
                max = arr[i];
            }
            System.out.print(",");
        }

        System.out.println(" the largest elemnet is : "+max);
    }
}
