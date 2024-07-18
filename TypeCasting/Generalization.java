 class Generalization{
    public static void main(String[] args) {
        Animal a = new Dog(); //Upcasting
             a.play();
            a = new Birds(); //Generalization = one refernce that is "a" storing multiple objects.
                a.play();

        
    }
}

class Animal{
    void play(){
        System.out.println("Animals will Play");
    }
}

class Dog extends Animal{
    void play(){
        System.out.println("Dog will bark");
    }
}

class Birds extends Animal{
    void play(){
        System.out.println("Birds will fly");
    }
}

