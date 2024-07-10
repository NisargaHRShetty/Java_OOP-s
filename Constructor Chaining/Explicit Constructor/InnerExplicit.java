class Explicit {
    Explicit(String name, int age){
        System.out.println("Haii "+name + " your age "+ age);
    }
}

class InnerExplicit extends Explicit{

    InnerExplicit(){
        super("Nisarga H R", 21);
        
        System.out.println("Welcome to HyperNext");
    }
    public static void main(String[] args) {
        new InnerExplicit();
    }
}