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
//Main class
public class Program2{
    public static void main(String[] args) {
        Car myCar = new Car("Toyoto", 2020, "Corolla");

        myCar.displayInfo();
        myCar.displayModel();
    }
}

