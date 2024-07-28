


//  * https://youtu.be/Et7-q35VW-k?si=FoZxNvKS7sWEBefJ

/*
 * Segregate Even and odd number :

    Given an array All, write a function that segregates even and odd numbers. The
    functions should put all even numbers first, and then odd numbers.

    * Note: Order of elements does not matter

    Input = {12, 34, 45, 9, 8, 90, 3}
    Output = {12, 34, 8, 90, 45, 9, 3}

    Input = {12, 10, 9, 45, 2, 10, 10, 45 }
    Output = 12 10 2 10 10 45 9 45

 */

//  output

import java.util.Scanner;

public class SeprateOddEvenNumber {


    public static int[] getInputs(){
         System.out.print("Enter length of array:");
         Scanner obj = new Scanner(System.in);
         int n = obj.nextInt();
         int[] nums = new int[n];
         System.out.println( );

         for(int i =0; i<n; i++){
            System.out.print("Enter value at index " + i + " : " );
            int num = obj.nextInt();
            nums[i] = num;
        }
        return nums;
    }


    public static void seprate(int [] nums){
        int l = 0;
        int r = nums.length-1;

        while(l<r){
            if(nums[l]%2 == 0){
                l++;
                continue;
            }
            if(nums[r]%2 == 1){
                r--;
                continue;
            }

            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
         
    }
    



    public static void main(String[] args) {
        int[] nums = getInputs();
        seprate(nums);

        for (int i : nums) {
            System.out.print(i+" ");
        }
        
    }
}
