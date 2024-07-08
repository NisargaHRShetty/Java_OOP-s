/* Write a program by following the below scenario
 Create a class called as student.
 Declare two attributes called as age & name.
 Initialize those two attribute with the help of a constructor.
 Create another class called as solution& under main method create two 
instance of student store it inside an array & traverse it using for loop.*/

class Student {
    public int age;
    public String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
}

public class Solution{
    public static void main(String[] args) {
        Student s1 = new Student(16, "Surabhi");
        Student s2 = new Student(21, "Nisu");

        Student[] students = {s1, s2};

        //Traverse the array using a for loop 
        for(int i = 0; i < students.length; i++){
            System.out.println("Student "+(i+1)+ ":");
            System.out.println("Name: "+ students[i].name);
            System.out.println("Age: "+ students[i].age);
            System.out.println();
        }
    }
}