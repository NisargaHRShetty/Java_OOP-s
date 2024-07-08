class Book{
    String title;
    String author;
    double price;

    Book(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        System.out.println("Non Parameterized Constructor called");
    }

     Book(String title){
        this.title = title;
        this.author = "Unknown";
        this.price = 0.0;
        System.out.println("Parameterized Constructor with one parameter called");
    }

    Book(String title, String author){
        this.title = title;
        this.author = author;
        this.price = 0.0;
        System.out.println("Parameterized Constructor with two parameter called");
    }

     Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Parameterized Constructor with three parameter called");
    }

    void display(){
        System.out.println("Title: "+title + ", Author :"+author + ", price" + price);
    }
}

public class ConMethodOver2{
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();

        Book b2 = new Book("Java");
        b2.display();

        Book b3 = new Book("Python", "Eric Mathew", 2000.00);
        b3.display();

        Book b4 = new Book("HTML", "Mark Pilgrim");
        b4.display();
    }
}