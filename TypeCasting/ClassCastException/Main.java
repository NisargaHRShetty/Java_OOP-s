//We can avoid this class cast exception by using 'instanceOf' operator

class Father{
    int age = 55;
}

class Son extends Father {
    int sAge = 35;
}

class Daughter extends Father {
    int dAge = 22;
}

class Main{
    public static void main(String[] args) {
        Father f = new Son();
         Father f2 = new Daughter(); //(Note if we want to print both class data then we want to use Specilaizatio only)

        if (f instanceof Son) {
            Son s = (Son)f;
            System.out.println("Father Age :" +s.age);
            System.out.println("Son Age :"+s.sAge);

        }
        if (f2 instanceof Daughter) {
            Daughter d = (Daughter)f2;
            System.out.println("Father Age :"+d.age);
            System.out.println("Daughter Age :"+d.dAge);
        }
    }
}