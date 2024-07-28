import java.util.Scanner;


// * https://youtu.be/fGW13SblVRU?si=YjcWcqEzFqH2oWUm

/*
 Factorial Program
    Given A number n, find its factorial

    Input 1:5
    Output 1 : 120
    Input 2: 4
    Output 2 : 24
 
 */

//  output
 /*
    
    Enter the number of for factorial: 3
    Factorial: 6

  */


public class FindFactorial {
     public static int getInputs(){
        Scanner obj = new Scanner(System.in);
        return obj.nextInt();
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of for factorial: " );
        int n = getInputs();
        int res = 1;
        for (int i = 2; i<=n; i++) {
            res *= i;
        }
        System.out.println("Factorial: " + res );
        
    }

}
