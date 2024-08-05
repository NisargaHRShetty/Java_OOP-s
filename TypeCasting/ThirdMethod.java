class Employee {
    void work() {
        System.out.println("working");
    }
}
class Devloper extends Employee {
    @Override
    void work() {
        System.out.println("developing app");
    }
}
class Tester extends Employee {
    @Override
    void work() {
        System.out.println("testing app");
    }
}
class ThirdMethod {
    Employee emp = new Developer(); //Here we are just creating object we add employee, Tester instead of developer.
    static void display(Employee emp) { //It will exceute first we need not to create a object
        emp.work();
    }
    public static void main(String[] args) {
        display(new Devloper());
        display(new Tester());
        System.out.println("tester");

        Employee e1 = new Devloper(); //Specialization
        e1.work();
        Employee e2 = new Tester();
        e2.work();
        System.out.println("testing app");

        Employee emp;  //Generalization
        emp = new Devloper();
        emp.work();
        emp = new Tester();
        emp.work();
    }
}
