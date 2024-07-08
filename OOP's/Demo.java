public class Demo{

    static int staticCounter=0;

    int nonStaticCounter = 0;

    public static void staticMethod(){
        staticCounter++;
        System.out.println("Static method called. Static counter : " + staticCounter);
    }
    public void nonStaticMethod(){
        nonStaticCounter++;
        System.out.println("Non Static method called. Non static counter: "+ nonStaticCounter);
    }

    public static void main(String[] args) {
        Demo.staticMethod();
        Demo.staticMethod();

        Demo md = new Demo();

        md.nonStaticMethod();
        md.nonStaticMethod();

        md.staticMethod();

    }
    }
