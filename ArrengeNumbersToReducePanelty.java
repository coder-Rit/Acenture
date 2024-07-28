import java.util.Arrays;
import java.util.Scanner;


// * https://youtu.be/KN_IWKDpIrc?si=Yi4FJbHJOOhfAibI

/*
Numbers Puzzle
    Given a set of numbers, one can arrange them in any order but it pays a penalty equal
    to the sum of the absolute differences between adjacent numbers.
    Return the minimum penalty that must be paid

    Input Specification:
    input1: length of an integer array of numbers (2 < input < 10001)
    input2: integer array (1 <= inputti]<= 10000)
 */

 /*
  Enter length of array:5

Enter value at index 0 : 8

Enter value at index 1 : 6

Enter value at index 2 : 2

Enter value at index 3 : 8

Enter value at index 4 : 6

new arrengement: [2, 6, 6, 8, 8]
  */

public class ArrengeNumbersToReducePanelty {
    
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
            System.out.println( );
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] nums = getInputs();
        Arrays.sort(nums);
        System.out.println("new arrengement: "+ Arrays.toString(nums) );
    }

}
