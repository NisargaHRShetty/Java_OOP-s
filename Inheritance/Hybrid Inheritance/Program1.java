interface Animal{
    void eat();
}

interface Pet{
    void play();
}

class Dog implements Animal, Pet{
    public void eat(){
        System.out.println("THe dog eats food");
    }

    public void play(){
        System.out.println("THe dog play");
    }
}

class Program1{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.play();
    }
}
