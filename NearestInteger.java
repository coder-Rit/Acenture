import java.util.Scanner;


// * https://youtu.be/KyCOQmF8Imo?si=AfsMMKBL4UWvTzFR

/*
 
    * Nearest Integer :

    Int nearestinteger (int num, int m)

    The function accepts two positive 'num' and 'm' as its argument. Implement the
    following function to find the nearest integer to num.

        1) Number is divisible by m.
        2) Number is nearest to 'num' ( Have the least distance from num )
    
    * Note : if there are two numbers with the least distance from num, then return the larger num.

    Input 1 :
    Num = 67
    M = 8
 
 */








// output
/*
    num: 26
    m: 3
    Nearest Integer: 27
 */
public class NearestInteger {

    public static int getInputs(){
        Scanner obj = new Scanner(System.in);
        return obj.nextInt();
    }

    public static void main(String[] args) {
        System.out.print("num: ");
        int num = getInputs();
        System.out.print("m: ");
        int m = getInputs();

        int minMultiple = num/m;
        int maxMultiple = minMultiple+1;

        if(num - minMultiple*m < maxMultiple*m -num){
            System.out.println("Nearest Integer: " + minMultiple*m);
        }else{
            System.out.println("Nearest Integer: " + maxMultiple*m);
        }

        
    }
    
}
