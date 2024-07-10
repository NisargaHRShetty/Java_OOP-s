 class implicitConstructor{
    implicitConstructor(){
        System.out.println("Implicit Constructor");
    }
}

class InnerImplicitConstructor extends implicitConstructor{
    InnerImplicitConstructor(){
        System.out.println("Inner Implicit Constructor");
    }
    public static void main(String[] args) {
        new InnerImplicitConstructor();
    }
}