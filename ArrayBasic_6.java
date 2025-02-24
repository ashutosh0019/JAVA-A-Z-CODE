import java.util.Scanner;

public class ArrayBasic_6 {
    public static void main(String[] args) {
        System.out.println("Java program to search for an element in an array");
        System.out.println("enter any number to check that the number is present or not");
        Scanner sc = new Scanner(System.in);

        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        int num = sc.nextInt();

        boolean found = false;
        for(int i = 0; i<arr.length; i++){
            

            if(arr[i] == num){
                System.out.println("yes this number is present in array");
                found = true;
                break;
            }
            
        }

        if(! found){
            System.out.println("sorry this number is not present in this array");
        }
        sc.close();
    }
}
