import java.util.Scanner;

class AddNewNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter a new number to add to the array: ");
        int newNum = sc.nextInt();
        int[] newArray = new int[n+1];

        for(int i=0; i<n; i++){
            newArray[i] = nums[i];
        }

        newArray[n] = newNum; //Add new number to the end of an array

        System.out.println("Updated Array: ");
        for(int i=0; i<newArray.length; i++){
            System.out.println(newArray[i]+ " ");
        }
        

    }
}