public class ArrayBasic_9 {
    public static void main(String[] args) {
        System.out.println("Java program to sort an array Using Bubble Sort algorithm");

        int arr[] = {5,2,3,4,6,1,8,9,7};

        for(int i = 0; i<arr.length-1;i++){
            boolean swapped = false;
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    // System.out.print(temp);
                    arr[j] = arr[j+1];
                    // System.out.print(arr[j]);
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)break;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
