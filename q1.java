import java.util.Scanner;

//pattern printing5


/*

 Plz enter the number
5
*****
 ****
  ***
   **
    *
 */
class q1{

    public static void patternPrinter(int N){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append('*');
        }

        for (int i = 0; i < N; i++) {
            System.err.println(sb.toString());
            sb.replace(i, i+1, " ");
        }
    }

    public static int getInputs(){
        System.err.println("Plz enter the number");
        Scanner obj = new Scanner(System.in);
        int n =  obj.nextInt();
        return n;
    }

    public static void main(String args[]){
        System.out.println("namaste");  
        int N = getInputs();
        patternPrinter(N);

    }

}