abstract class Emp{
    abstract void work();
    abstract void display();
}
 class Person extends Emp{
    @Override
    void work(){
        System.out.println("Working"); //method override that changing the implementation
    }
    @Override
    void display(){
        System.out.println("Welcome");
    }
}

    class Abstract{
        public static void main(String[] args) {
           Emp e = new Person(); //Upcasting
            e.work();
            e.display();

        }

    }
