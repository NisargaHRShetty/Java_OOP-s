class InvalidPasswordException extends RuntimeException {
     public InvalidPasswordException(String message) {
        super(message);
    }
    
}

public class WithGetMsg {
    
    public static void main(String[] args) {
        String password = "123";
        if ("121".equals(password)) {
            System.out.println("Login Successful!!!");
        }else{
            try {
                throw new InvalidPasswordException("Wrong Password.....");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
