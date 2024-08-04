class MultipleTry {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c[] = {1, 2, 3};

        try {
            try {
                System.out.println(a / b); 
            } catch (ArithmeticException e) {
                System.out.println("Can't divide by Zero");
            }

            try {
                System.out.println(c[80]); 
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Can't Find the value");
            }
        } catch (Exception e) {
            
            System.out.println("An unexpected error occurred: " + e);
        }
    }
}
