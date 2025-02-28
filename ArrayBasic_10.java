public class ArrayBasic_10 {
    public static void main(String[] args) {
        System.out.println("Java program to sort an array in ascending and descending order");

        int arr [] = {1,5,4,2,3,6,9,7,4,1,2,5,3};
        for(int i=0; i<arr.length; i++){
            // System.out.println("ascending order");
            boolean swapped = false;
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;

                }
            }
            if(!swapped)break;
        }
        System.out.println("ascending order of array element");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("descending order of array element");
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
