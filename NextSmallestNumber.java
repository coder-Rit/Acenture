import java.util.Scanner;

/*
 * 
Question :
    * Next Smaller Number:
        The function Accepts an integer array 'a' of size m. Replace each number of
        array with nearest smaller number on its right in the array.

    * Assumption : 
        All integers are > 0.

    * Note :
        • Return null if array is null;
        • Replace number with '-1', if no number, is present on its right.
  
 */

 // Input output
 /*
  
Enter length of array:5

Enter value at index 0 : 1

Enter value at index 1 : 2

Enter value at index 2 : 3

Enter value at index 3 : 4

Enter value at index 4 : 5

1 2 3 4 5
-1 -1 -1 -1 -1

 */



public class NextSmallestNumber {




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

    public static void printArr(int num []){
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    

    public static void main(String args[]){

        int  []nums  = getInputs();
        int n = nums.length;
        int res [] = new int[n];
        res[n-1] = -1;
        // printArr(nums);

        for(int i = 0; i<n-1;i++){
            int itemp = i+1;
            while(itemp<n && nums[i]<nums[itemp]) itemp++;
            
            if(itemp>=n) res[i] = -1;
            else res[i] = nums[itemp];
        }
        
        printArr(nums);
        printArr(res);
        
        
    }



    
    
}
