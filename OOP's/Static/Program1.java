public class Program1{
    //Static Variable 

    static int staticVariable; //Static variable associated with the class itself, not with instance of class

    //Static Block
    static {
        System.out.println("Static Block is executed.");
        staticVariable = 06;
    }

    // Constructor
    public Program1() {
        System.out.println("Constructor is executed.");
    }
    //Main method
    public static void main(String[] args) {
        System.out.println("Main method is executed.");
        System.out.println("Static variable value : " + staticVariable);

        //Create an instance of Program1
        Program1 pg = new Program1(); // it will triggers the constructor
    }

}