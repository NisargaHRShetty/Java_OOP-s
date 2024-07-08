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
class ElectricCar extends Car{
    int batteryCapacity;

    public ElectricCar(String brand, int year, String model, int batteryCapacity) {
        super(brand, year, model);
        this.batteryCapacity = batteryCapacity;
    }

    void displayElec(){
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

