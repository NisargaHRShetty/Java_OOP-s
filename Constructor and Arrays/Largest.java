// Check largest number in an array

import java.util.Scanner;

class Largest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int largest = nums[0]; //Assume first numbers is smallest
        for(int i=1; i<n; i++){
           if(nums[i] > largest){
            largest = nums[i];
           }
        }
 System.out.println("THe largest number in an Array is : " + largest);
           

    }
}