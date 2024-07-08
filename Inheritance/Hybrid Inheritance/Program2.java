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

//Interface
interface Electric{
    void displayElec();
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
class ElectricCar extends Car implements Electric {
    int batteryCapacity;

    public ElectricCar( String brand, int year, String model, int batteryCapacity) {
        super(brand, year, model);
        this.batteryCapacity = batteryCapacity;
    }

    public void displayElec(){
        System.out.println("Battery Capacity: "+ batteryCapacity + "kwh");
    }
    
}

//Main class
public class Program2{
    public static void main(String[] args) {
        ElectricCar myElec = new ElectricCar("Tesla", 2023, "Model S", 100);
        

      myElec.displayInfo();
        myElec.displayModel();
        myElec.displayElec();

        

    }
}
/*

// Superclass
class Vehicle {
    // Attributes of Vehicle
    String brand;
    int year;

    // Constructor of Vehicle
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method of Vehicle
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Interface
interface Electric {
    void displayBatteryCapacity();
}

// Subclass: Car
class Car extends Vehicle {
    // Additional attribute of Car
    String model;

    // Constructor of Car
    Car(String brand, int year, String model) {
        super(brand, year); // Calling the constructor of the superclass
        this.model = model;
    }

    // Method of Car
    void displayModel() {
        System.out.println("Model: " + model);
    }
}

// Subclass: ElectricCar
class ElectricCar extends Car implements Electric {
    // Additional attribute of ElectricCar
    int batteryCapacity;

    // Constructor of ElectricCar
    ElectricCar(String brand, int year, String model, int batteryCapacity) {
        super(brand, year, model); // Calling the constructor of the superclass
        this.batteryCapacity = batteryCapacity;
    }

    // Method from Electric interface
    public void displayBatteryCapacity() {
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Subclass: Bike
class Bike extends Vehicle {
    // Additional attribute of Bike
    String type;

    // Constructor of Bike
    Bike(String brand, int year, String type) {
        super(brand, year); // Calling the constructor of the superclass
        this.type = type;
    }

    // Method of Bike
    void displayType() {
        System.out.println("Type: " + type);
    }
}

// Main class
public class Program2 {
    public static void main(String[] args) {
        // Creating an instance of ElectricCar
        ElectricCar myElectricCar = new ElectricCar("Tesla", 2023, "Model S", 100);
        
        // Creating an instance of Bike
        Bike myBike = new Bike("Yamaha", 2021, "Sport");

        // Calling methods for ElectricCar
        myElectricCar.displayInfo();            // Method inherited from Vehicle class
        myElectricCar.displayModel();           // Method inherited from Car class
        myElectricCar.displayBatteryCapacity(); // Method from Electric interface
        
        // Calling methods for Bike
        myBike.displayInfo();   // Method inherited from Vehicle class
        myBike.displayType();   // Method from Bike class
    }
}

*/