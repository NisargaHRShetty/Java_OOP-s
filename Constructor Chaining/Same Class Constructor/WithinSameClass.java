class WithinSameClass{
    WithinSameClass(){
        System.out.print(" In Dog I like breed ");
    }
    WithinSameClass(String breed, String name){
        this();
        System.out.print(breed+ " Name " +name);
    }
   /* WithinSameClass(String name){
        this("German Shepherd,  ");
        System.out.println(name);
    }*/
    public static void main(String[] args) {
        WithinSameClass wsc = new WithinSameClass("German Shepherd", " Tommy" );
    }
    
    
}