class This{
    //Member variables(instance variables)
    public int number;
    public String name;

    //Constructor
    public This(int number, String name) {
        //Using 'this'
        this.number = number;
        this.name = name;
    }

    public void display(){
        //Local varibales
        int number = 10;
       String name = "LocalName";

    //Display local variables
    System.out.println("Local Variables number:" + number);
    System.out.println("Local Variables name:" + name);

 
//Display the member variables
 System.out.println("Member Variables number:" + this.number);
    System.out.println("Member Variables name:" + this.name);
    }
   

    public static void main(String[] args) {
         //System.out.println("Member Variables number:" + this.number);
    //System.out.println("Member Variables name:" + this.name);

        This th = new This(25, "Nisu");
        th.display();
    }

}