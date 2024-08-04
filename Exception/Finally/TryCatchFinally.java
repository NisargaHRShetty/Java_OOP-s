import java.util.Scanner;

class TryCatchFinally{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        int a = sc.nextInt();
        System.out.println("Enter a second number");
        int b = sc.nextInt();
        int c[] = {1, 2, 3};
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by Zero");
        } finally{
            System.out.println("Completed"); //excuted default
            try {
                System.out.println(c[50]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }finally{
                System.out.println("Within Finally finally Statement");
            }
        }
    }
}

