abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

abstract class Dog extends Animal{
    public void animalSound(){
        System.out.println("The Dog says: bow bow");
    }
}

class AbstractOverrideAbstractClass extends Dog {
  public static void main(String[] args) {
// Animal a = new Animal();    Error

    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();

    //Dog d = new Dog(); //Error
    Dog d = new AbstractOverrideAbstractClass();
    d.animalSound();
    d.sleep();


  }
}
 
 
 

