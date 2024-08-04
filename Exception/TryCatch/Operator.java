
import java.util.Scanner;

class Operator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        int a = sc.nextInt();
        System.out.println("Enter a second number");
        int b = sc.nextInt();
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by Zero");
        }
    }
}