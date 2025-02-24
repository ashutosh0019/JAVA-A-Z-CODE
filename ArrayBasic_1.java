public class ArrayBasic_1 {
    public static void main(String[] args) {
        System.out.println("Java program to declare, initialize, and print an array.");
        //declare an array
        int [] number = {1,2,3,4,5,6,7,8};

        //print an array with element
        System.out.println("Array Elements are: ");
        for(int i = 0; i<number.length; i++){
            System.out.println("At index nuber : "+i +" " +"value is : " +number[i]);
        }
        
    }
}