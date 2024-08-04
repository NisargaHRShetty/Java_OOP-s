public class StringMethod {
    public static void main(String[] args) {
        String name = "Nisarga";
        name = "Nisu";

        String name1 = "n";
        String name2 = "Nisu";
        
        System.out.println(name);
        System.out.println(name.toString());
        System.out.println(name1.hashCode()); //returns ASCII value
        System.out.println(name.equals(name2));// compares a strings
    }
}

