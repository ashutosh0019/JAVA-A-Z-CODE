import java.util.Scanner;

public class ArrayBasic_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int arr_size = sc.nextInt();

        int arr [] = new int [arr_size];

        System.out.println("enter "+arr_size+" elements in array");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        
        System.out.println("your entered these "+arr_size+" elements in array");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println("these element are even number");
        for(int num : arr){
            if(num%2==0){
                System.out.print(num+" ");
            }
        }
        System.out.println();
        System.out.println("these element are odd number");
        for(int num : arr){
            if(num%2!=0){
                System.out.print(num+" ");
            }
        }
        System.out.println();


        sc.close();
    }
}
