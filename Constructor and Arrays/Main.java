/*Write a program by following the below scenario.
 Create a class called as employee.
 Declare three attributes called as id, name & salary.
 Initialized those three attributes with the help of a constructor.
 Create another class called as main class under main method create three 
instance of employee, store it inside an array & transverse it using for loop
by printing alt+shift+s to create constructor. */

class Employee {
    public int id;
    public String name;
    public double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}


public class Main{
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Nisarga", 60000.0);
        Employee e2 = new Employee(2, "Surabhi", 70000.0);
        Employee e3 = new Employee(3, "Nagalakshmi", 65000.0);

        Employee[] employee = {e1, e2, e3};

        //Traverse the array using a for loop 
        for(int i = 0; i < employee.length; i++){
            System.out.println("Employee "+(i+1)+ ":");
            System.out.println("ID: "+ employee[i].id);
            System.out.println("Name: "+ employee[i].name);
            System.out.println("Salary: $"+employee[i].salary);
            System.out.println();
        }
    }
}