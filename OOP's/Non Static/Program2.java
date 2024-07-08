class Program2{

    public int num1;
    public int num2;
    public int sum;

    //Non-static Block
   {
        System.out.println("Non-Static block is executed.");
        num1 = 5;
        num2 = 10;
        sum = num1 + num2;
    }

    //Method to display the sum
    public void displaySum(){
        System.out.println("The sum is " + sum);
    } 

   public static void main(String[] args) {
       System.out.println("Main method is executed");
       Program2 pg = new Program2();
       pg.displaySum();
       
   }
}