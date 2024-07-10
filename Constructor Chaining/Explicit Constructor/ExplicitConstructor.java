class Constructor {
    Constructor(String name){
        System.out.println("Haii " + name);
    }
}

class ExplicitConstructor extends Constructor{
    ExplicitConstructor(){
        super("Nisu Shetty");
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        new ExplicitConstructor();
    }
}