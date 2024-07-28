import java.util.Scanner;




//* https://youtu.be/72KRyyqarJs?si=L9UEaFqJqQZZ06qZ

    /*
    Frequency Count :

    Given the string, Find the frequency of each character in it.
    The input string contains only lowercase letters. The output string should contain a
    letter followed by its frequency, in the alphabetical order (from a - z)

    Input 1 : babdc
    Output 1 : alb2c1d1

    Input 2 : cbd
    Outnut 2 : 61c1d1
     */


public class FreqFinder {

    public static String getInputString(){
        Scanner obj = new Scanner(System.in);
        return obj.nextLine();
    }


    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        String str = getInputString();
        int map[] = new int[201];

        for (char i : str.toCharArray()) {
            map[i]++;
        }
        StringBuilder sb =new StringBuilder();
        
        for (int i=0;i<201;i++) {
            if(map[i]!=0){
                sb.append(Character.toString((char) i) + map[i]);
            }
        }

        System.out.println(sb.toString());

    }
}
