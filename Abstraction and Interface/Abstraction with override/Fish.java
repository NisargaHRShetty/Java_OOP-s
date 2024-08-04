public class Fish extends Animal {

    public Fish(String size, String type, double weight) {
        super(size, type, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")){
            System.out.println( type + " lazily Swimming");
        }else{
            System.out.println(type +" darting frantically");
        }
    }

    @Override
    public void makeNoise() {
        if (type == "GoldFish") {
            System.out.println("Swish...");
        }else{
            System.out.println("Splash...");
        }
    }

}