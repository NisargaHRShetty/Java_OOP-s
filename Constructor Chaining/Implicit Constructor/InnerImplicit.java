class ProgramImplicit{
    ProgramImplicit(){
        System.out.println("Implicit Constructor Called");
    }
}

class InnerImplicit extends ProgramImplicit{
    InnerImplicit(){
        System.out.println("Inner Implicit Constructor Called");
    }
    
    public static void main(String[] args) {
        new InnerImplicit();
    }
}