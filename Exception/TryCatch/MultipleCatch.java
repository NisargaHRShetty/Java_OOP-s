class MultipleCatch{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c[] = {1, 2, 3};
        // try {
        //     System.out.println(a/b);
        //     System.out.println(c[80]);
        // } catch (ArithmeticException e) {
        //     System.out.println("Can't divide by Zero");
        // }
        // catch (ArrayIndexOutOfBoundsException e){
        //     System.out.println("Can't Find the value");
        // }catch (Exception e){
        //     System.out.println("Unexpected Error");

        //  }

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
     }
}