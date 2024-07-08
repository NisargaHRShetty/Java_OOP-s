import java.util.Scanner;

class Scan{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a age");
        byte age = sc.nextByte();
        System.out.println("Age :" + age);

        System.out.println("Enter a Year");
        short year = sc.nextShort();
        System.out.println("Year :" + year);

        System.out.println("Enter a Salary");
        int sal = sc.nextInt();
        System.out.println("Salary :" + sal);

        System.out.println("Enter a Distance");
        long dis = sc.nextLong();
        System.out.println("Distance :" + dis);

        System.out.println("Enter a Height");
        float height = sc.nextFloat();
        System.out.println("Height :" + height);

         System.out.println("Enter a Double Number");
        double num = sc.nextDouble();
        System.out.println("Double :" + num);

         System.out.println("Enter a any letter");
        char letter = sc.next().charAt(0);
        System.out.println("Letter :" + letter);

         System.out.println("Enter a name");
        String name = sc.next();
        System.out.println("Name :" + name);

        System.out.println("Are you Student? (true/false)");
        boolean stu = sc.nextBoolean();
        System.out.println("Are You Student :" + stu);


        

    }
}