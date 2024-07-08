class Shape{
    void draw(){
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw(){
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    void draw(){
        System.out.println("Drawing a Square");
    }
}

class Program2{
    public static void main(String[] args) {
        Shape myShape = new Shape();

        myShape.draw();

        Square mySq = new Square();
        mySq.draw();

        Circle mycir = new Circle();
        mycir.draw();

        Shape shape1 = new Circle();
        shape1.draw();

        Shape shape2 = new Square();
        shape2.draw();
    }
}