
import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        System.out.println("creating methods or function program");

        // calling methods
        //static method (without user input)
        MyName();

        //dynamic method (with arguments)
        stu_name("ashutosh", 1);

        //sqaure mentod calling 
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any number to make square");
        int numb = sc.nextInt();
        square(numb);

    }

    // create method
    public static void MyName() {
        System.out.println("my name is Ashutosh Shukla");
    }

    //methods with arguments
    public static void stu_name(String name, int roll){
        System.out.println("name: "+ name);
        System.out.println("roll: "+ roll);
    }

    //square of user input number
    public static void square(int num) {
        int sqr = num * num;
        System.out.println("square of "+num+ " is "+ sqr);
    }

    
}