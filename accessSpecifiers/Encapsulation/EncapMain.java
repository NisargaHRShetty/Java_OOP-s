class EncapMain{
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setAge(15);
        obj.setBreed("German Shepered");
        obj.setColor("Brown");
        obj.setName("Tommy");
        System.out.println("Dog Breed :" +obj.getBreed());
        System.out.println("Dog Name :"+obj.getName());
        System.out.println("Dog Color: "+obj.getColor());
        System.out.println("Dog Age:" +obj.getAge());
    }
}