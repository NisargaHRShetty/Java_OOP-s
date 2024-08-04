
class InvalidPasswordException extends RuntimeException {
    private String message;

    public InvalidPasswordException(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
    
}

public class WithGetMessage {

    public static void main(String[] args) {
        String password = "123";
        if (password == "121") {
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
