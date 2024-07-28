

    // * https://youtu.be/Nti9ktUoqnY?si=HFJIASL5GmyXZ5u3
    
    /*
     Nth character in Decrypted String
    Every character in the input string is followed by its frequency .
    Write a function to decrypt the string and find nth character of the decrypted string .
    If no character exists at that position then return "-1" .
    For example: if the input string is "a263", the decrypted string will be "aabbb"
    Note: The frequency of encrypted string can not be greater than single digit i.e < 10.

    Example 1:
    Input 1 : a2b2c2d1
    Input 2: 5

     */

import java.util.Scanner;

public class NthCharInDecryptedString {


    public static String getInputString(){
        Scanner obj = new Scanner(System.in);
        return obj.nextLine();
    }
    public static int getInput(){
        Scanner obj = new Scanner(System.in);
        return obj.nextInt();
    }


    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        String str = getInputString();
        System.out.print("Enter N: ");
        int num = getInput();

        int i = 1;
        int count = 0;
        while(i>0 && i<str.length() && count<num){
            count+= Character.getNumericValue(str.charAt(i));
            i+=2;
        }
        System.out.println(str.charAt(i-3));
    }
    
}
