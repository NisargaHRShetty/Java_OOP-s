//Compile time polymorphism is also a Method Overloading .

public class Main{

    public String Connect(String a, String b){
        return a + b;
    }

    public String Connect(String a, String b, String c){
        return a + b + c;
    }

    public String Connect(String a, String b, int c){
        return a + b + c;
    }

    public double Connect(int a, double b){
        return a + b;
    }

    public static void main(String[] args) {
    Main c = new Main();

    System.out.println("Concate Hello and World : "+ c.Connect("Hello", "World"));
    System.out.println("Concate Hello, Nisu and Shetty : "+ c.Connect("Hello", "Nisu", "Shetty"));
    System.out.println("Concate Nisu, Age and 21 : "+ c.Connect("Nisu","Age", 21));
    System.out.println("Add 10 + 20 : "+ c.Connect(10, 20));

    }

}