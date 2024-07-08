class Vehicle{
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: "+ brand);
        System.out.println("Year: "+ year);
    }
}
//subclass
class Car extends Vehicle {
    String model;

    Car(String brand, int year, String model){
        super(brand, year);
        this.model=model;
    }

    void displayModel(){
        System.out.println("Model: "+model);
    }
}

//Subclass for car
class Bike extends Vehicle{
    String type;

    public Bike( String brand, int year, String type) {
        super(brand, year);
        this.type = type;
    }

    void displayBike(){
        System.out.println("Type: "+ type);
    }
    
}

//Main class
public class Program2{
    public static void main(String[] args) {
        Car myCar = new Car("Tesla", 2023, "Model S");
        Bike myBike = new Bike("Yamaha", 2021,"Sport");

        myCar.displayInfo();
        myCar.displayModel();

        myBike.displayInfo();
        myBike.displayBike();

    }
}

