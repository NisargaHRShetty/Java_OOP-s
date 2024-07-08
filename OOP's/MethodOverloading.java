class MethodOverloading{

    public int add(int a, int b) {
        return a+b;
    }

    public double add(double a, double b) {
        return a+b;
    }

    public int add(int a, int b, int c) {
        return a+b+c;
    }

    public double  add(int a, double b) {
        return a+b;
    }
    public static void main(String[] args) {
       MethodOverloading md = new MethodOverloading();
       
      System.out.println("5+6 :" +md.add(5, 6));
      System.out.println("5.5+6.5 :" +md.add(5.5, 6.5));
      System.out.println("5+6+10 :" +md.add(5, 6, 10));
      System.out.println("5+6.5 : " +md.add(5, 6.5));
    }
}