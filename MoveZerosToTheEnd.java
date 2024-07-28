 


 /*
    * Move Zeroes To End :
    Given an Integer array, move all zeroes to end of the array, keeping the relative order
    of non-zero elements same.

    Input : arrl] = {1, 2, 0, 0, 0, 3, 6}
    Output : 1236000

    Input: arrl] = {10, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}
    Output: 1984276900000

  */


   // [10, 1, 9, 8, 4, 2, 7, 6, 9, 0, 0, 0, 0]

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToTheEnd {

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

    public static void moveZeroesToEnd(int[] nums) {
        int pt1 = 0;
        int pt2 = 0;
        int n = nums.length;
        while (pt2<n && pt1<n ) {
            if(nums[pt1] == 0){
                if(pt2<pt1)pt2 = pt1;
                while (pt2<n) {
                    if (nums[pt2] != 0) {
                        nums[pt1] = nums[pt2];
                        nums[pt2] = 0;
                        break;
                    }
                    pt2++;
                }
            }
            pt1++;
        }       
    }

    public static void main(String[] args) {

        int[] nums = getInputs();
        moveZeroesToEnd(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    
}