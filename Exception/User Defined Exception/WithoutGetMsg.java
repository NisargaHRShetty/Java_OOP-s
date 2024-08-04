
class InvalidPasswordException extends RuntimeException {

}

class WithoutGetMsg {

    public static void main(String[] args) {
        String password = "123";
        if (password == "121") {
            System.out.println("Login Successful!!!");
        }else{
            try {
                throw new InvalidPasswordException();
            } catch (Exception e) {
                System.out.println("Wrong Password");
            }
        }
    }
}
