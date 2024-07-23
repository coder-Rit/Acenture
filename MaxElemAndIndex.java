import java.util.Scanner;



//* https://youtu.be/kZNknyphgFc?si=0nrUzCyzBnvHtE6O

/*
 
    A function accepts an array and length field, implement the
    function to find the maximum element of array and print maximum
    element and its index.

    The maximum element and its index should be printed in next line.

    * Note :
        • Array index starts with 0.
        • Maximum element and its index should be separated by new line.
        • Assume there is only 1 maximum element in array.

    * Example 1 :
        1234567
        7
        Output :
        7
        6

 */


// output

/*
 
Enter length of array:6

Enter value at index 0 : 1

Enter value at index 1 : 2

Enter value at index 2 : 3

Enter value at index 3 : 4

Enter value at index 4 : 5

Enter value at index 5 : 6

6
5
 
 */
public class MaxElemAndIndex {

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

    public static void findMax(int[] nums){
        int maxElem = Integer.MIN_VALUE;
        int Idx = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>maxElem){
                maxElem = nums[i];
                Idx = i;
            }
        }
        System.out.println(maxElem);
        System.out.println(Idx);
    }
    public static void main(String[] args) {
       int [] nums = getInputs();
       findMax(nums);
    }
}
