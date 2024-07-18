// Convert bigger to small data type

class Narrowing {
    public static void main(String[] args) {
        double pie = 3.1457896;
        int dupPie = (int)pie; //Explicitly we are converting the data type

        System.out.println("Pie Value: "+pie);
        System.out.println("Duplicate Value :"+dupPie);
    }
}