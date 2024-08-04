
public class ClassCastException {

    public static void main(String[] args) {
        Animal a = new Herbivores(); //upcast
        try {
            Carnivores c = (Carnivores) a;
            // c.grass();
            c.meat();
            c.ground();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Printing full information");
            e.printStackTrace();
        }
        System.out.println("Completed");
    }
}

class Animal {

    public void ground() {
        System.out.println("Lives in ground");
    }
}

class Herbivores extends Animal {

    public void grass() {
        System.out.println("Herbivores eat grass only");
    }
}

class Carnivores extends Animal {

    public void meat() {
        System.out.println("Carnivores eat meat only");
    }
}
