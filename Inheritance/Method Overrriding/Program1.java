

class Animal {
    void eat(){
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal{
    @Override

    void eat(){
        System.out.println("The dog eats bones");
    }

    void bark(){
        System.out.println("The dog barks.");
    }
}

class Program1{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
         dog.eat();
         dog.bark();
        
        Animal pet = new Animal();
        pet.eat();
    }
}