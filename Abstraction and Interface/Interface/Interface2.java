interface Animal {
    void eat();
}

// Define another interface that extends the base interface
interface Pet extends Animal{
    abstract void play();
}

interface Fish {
    void swim();
}

// Implementing class
class Dog implements Pet, Fish {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }

    public void swim(){
        System.out.println("Swish, Swish...");
    }
}


public class Interface2 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.play();
        myDog.swim();

        
    }
}

// public class Interface2 {
//   public static void main(String[] args) {
// 	Fea f=new Fea();
// 	f.ver1();
// 	f.ver2();
// 	f.Iver1();
// 	f.Iver2();
// }
// }
// interface Whatsp{
// 	abstract void ver1();
// 	abstract void ver2();
// }
// interface Instagram{
// 	void Iver1();
// 	void Iver2();
// }
// class Fea implements Whatsp,Instagram{
// 	public void ver1() {
// 		System.out.println("Ver 1- messages");
// 	}
// 	public void ver2() {
// 		System.out.println("Ver 2- Stories");
// 	}
// 	public void Iver1() {
// 		System.out.println("Post");
// 	}
// 	public void Iver2() {
// 		System.out.println("Posts and stories");
// 	}
// }

