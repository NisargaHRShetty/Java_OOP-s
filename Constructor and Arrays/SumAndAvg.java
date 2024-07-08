import java.util.Scanner;

class SumAndAvg{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
        }

        double average = (double)sum/n;

        System.out.println("Sum of the Elements: "+ sum);
        System.out.println("Average of the elements: "+ average);

    }
}