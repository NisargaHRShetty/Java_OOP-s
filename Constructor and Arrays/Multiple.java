// Multiple of 5 in an array

import java.util.Scanner;

class Multiple{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Multiple of 5 in an Array is : ");
        for(int i=0; i<n; i++){
           if(nums[i] % 5 == 0){
            System.out.println(nums[i] + " ");
           }
        }


    }
}