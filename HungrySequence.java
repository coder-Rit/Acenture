import java.util.Scanner;




// * https://youtu.be/6aFcEMQUDNo?si=8CsTEbf0ycRpazuv

/*
    * Coding Question :
        X and Y went on a date to a fine dining establishment. Up untill paying for the
        food; everything went smoothly. The waiter requests that lahub compose an n
        int hungry sequence, In exchange for payment.

        * A sequence a1, a2, ..., an, consisting of n integers, is Hungry if and only if:
            • Its elements are in increasing order. That is an inequality ai<aj holds for any two
            indices i, (i<j).
            • For any two indices i and j (i<j), aj must not be divisible by ai.
            lahub is in trouble, so he asks you for help. Find a Hungry sequence with n elements.


    * Constraints :
        N can be as large as 10^5 .
        The values in sequence that will be printed should not be greater than 1017.

        Input 1 :
        N = 3
        Output 1 :
        2
        9
        15
 */






 //output
 /*
    Enter the length of Hungry Sequence:7
    8 9 10 11 12 13 14 

  */


public class HungrySequence {


    public static int getInputs(){
        System.out.print("Enter the length of Hungry Sequence:");
        Scanner obj = new Scanner(System.in);
        return obj.nextInt();
    }

    public static int [] buildSeq(int n){
        int[] res = new int[n];
        int j =0;
        for(int i = n+1;i<=(n+n);i++){
            res[j] = i;
            j++;
        }
        return res;
    }

    public static void printArr(int[] arr){
        for(int num : arr)System.out.print(num+" ");
    }
    
    public static void main(String[] args) {
        int n = getInputs();
        printArr(buildSeq(n));
    }
    
}
