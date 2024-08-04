
import java.util.Scanner;

class Throws{
    public static void main(String[] args) {
        try {
            divide();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void divide() throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
      int a = sc.nextInt();
        System.out.println("Enter a second number");
         int b = sc.nextInt();
        int res = a/b;
        System.out.println("Result :" + res);
    }
}