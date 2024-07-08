//Write a program to demonstrate parameterized constructor and non parameterized constructor.

class Person{
    String name;
    int age;

    //Non-parameterized constructor
    public Person() {
        this.name = "Unknown";
        this.age= 0;
        System.out.println("Non-Parameterized constructor called");
    }
    
    //Parameterized Constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constructor{
    public static void main(String[] args) {

        //Creating an object using non-parameterized constructor
        Person p1 = new Person();
        p1.display();

        //Creating an object using parameterized constructor
        Person p2 = new Person("Nisu", 21);
        p2.display();
    }
}