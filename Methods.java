public class Methods {

    public static void main(String[] args) {
        System.out.println("creating methods or function program");

        // calling methods
        //static method (without user input)
        MyName();

        //dynamic method (with arguments)
        stu_name("ashutosh", 1);

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
}