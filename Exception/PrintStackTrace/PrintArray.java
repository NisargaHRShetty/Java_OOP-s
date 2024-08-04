import java.util.Scanner;

class PrintArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter a Elements in an array");
        for(int i=0; i<n ; i++){
        arr[i] = sc.nextInt();
        }

        try {
            System.out.println(arr[80]);
        } catch (Exception e) {
            e.printStackTrace(); //get full information of exception
            System.out.println("Completed");
        }
    }
}