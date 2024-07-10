class SameClass{
    SameClass(){
        System.out.println("Haii ");
    }

    SameClass(int age){
        this();
        System.out.println(age);
    }

    SameClass(String name){
        this(21);
        System.out.println(name);
    }


    public static void main(String[] args) {
        SameClass s = new SameClass("Nisu");
    }
}