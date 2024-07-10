public class Encapsulate{
    private String color;
    private String name;
    private String breed;
    private int age;

    public void barking(){
        System.out.println("Dog Barks");
    }

    public void eating(){
        System.out.println("Dog eats");
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }
}