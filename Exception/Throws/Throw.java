public class Throw {
    public static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");  // Throwing an ArithmeticException if the b is zero
        }
        int result = a / b;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        try {
            divide(10, 2); // Valid 
            divide(10, 0); // throw an exception
        } catch (ArithmeticException e) {
            
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
