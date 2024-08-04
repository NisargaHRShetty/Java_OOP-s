public class Dog extends Animal {

    public Dog(String size, String type, double weight) {
        super(size, type, weight);
    }

    @Override
    public void move(String speed) {
        if(speed == "slow"){
            System.out.println( type + " Walking");
        }else{
            System.out.println(type +" Running");
        }
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.println("Howling!...");
        }else{
            System.out.println("Woof!...");
        }
    }

}