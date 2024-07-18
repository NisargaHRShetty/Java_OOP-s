//Converting the super class refernce to 

class DownCasting{
    public static void main(String[] args) {
        Father f = new Son();
        Son s = (Son)f;

        f = new Daughter();
        Daughter d = (Daughter)f;

        System.out.println(f.age);
        System.out.println(s.sonAge);
        System.out.println(d.dAge); 
    }
}

class Father{
    int age = 55;
}

class Son extends Father{
    int sonAge = 25;
}

class Daughter extends Father{
    int dAge = 21;
}

