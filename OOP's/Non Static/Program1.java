class Program1{
   public int instanceCounter; //Instance Variable

//Non-Static Block 
{
    System.out.println("Non-Static Block is executed.");
    instanceCounter = 10;
}

//Constructor
public Program1(){
    System.out.println("Constructor is executed");
}

//Instance method
public void instanceMethod(){
    System.out.println("Instance method is executed.");
}
public static void main(String[] args) {
    System.out.println("Main method is executed.");
    Program1 pg = new Program1();
    System.out.println("Instance Counter :" + pg.instanceCounter);
    pg.instanceMethod();
}

}