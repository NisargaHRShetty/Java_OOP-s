class Rectangle{
    double length;
    double width;

    Rectangle(){
        this.length = 0.0;
        this.width = 0.0;
        System.out.println("Non Parameterized Constructor called");
    }

    Rectangle(double length){
       this.length = length;
        this.width = 0.0;
        System.out.println("Parameterized Constructor with one parameter called");
    }

    Rectangle(double length,double width){
       this.length = length;
        this.width = width;
        System.out.println("Parameterized Constructor with two parameter called");
    }

     double area(){
        return length * width;
     }

    void display(){
        System.out.println("Length: "+length + ", Width :"+width +"Area :"+area());
    }
}

public class ConMethodOver{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.display();

         Rectangle r2 = new Rectangle(10.0);
        r2.display();

        Rectangle r3 = new Rectangle(10.0, 20.0);
        r3.display();
       
    }
}