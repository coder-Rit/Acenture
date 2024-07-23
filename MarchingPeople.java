import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;




//* https://youtu.be/l_pjp-BG27k?si=yXSGC79NFKPgYSYW

// watch the video for better understanding;
/*
 
Question :
Infinite number of people are crossing a 2-d plane. They march in such a way
that each integral x- coordinate will have exactly one person who moves along it
in positive y direction, starting from (x,O).
You have to implement the function.

The function takes an integer matrix barrier having n rows and 3 columns where
n denotes the number of barriers. The ith barrier is defined by (xi,yi,di) , which
means that the barrier is blocking all the people who want to pass through points
lying on line segment connecting (xi,yi) and (xi+d,yi). Once a person encounters
a barrier, he stops.
 
 */





// output

/*
Enter length of barricades array:5
Enter the values for barricade01 : 
       Enter value at index 0 : 1
       Enter value at index 1 : 2
       Enter value at index 2 : 3

Enter the values for barricade11 : 
       Enter value at index 0 : 3
       Enter value at index 1 : 4
       Enter value at index 2 : 2

Enter the values for barricade21 : 
       Enter value at index 0 : 2
       Enter value at index 1 : 3
       Enter value at index 2 : 2

Enter the values for barricade31 : 
       Enter value at index 0 : 9
       Enter value at index 1 : 3
       Enter value at index 2 : 2

Enter the values for barricade41 :
       Enter value at index 0 : 11
       Enter value at index 1 : 3
       Enter value at index 2 : 2

10

 */

public class MarchingPeople {


    public static int[][] getInputs(){
         System.out.print("Enter length of barricades array:");
         Scanner obj = new Scanner(System.in);
         int n = obj.nextInt();
         int[][] barricades = new int[n][3];
         
         
         for(int i =0; i<n; i++){
            int[] barricade = new int[3];
            System.out.println("Enter the values for barricade" + i+1 + " : " );

            for(int j=0;j<3;j++){
                System.out.print("       Enter value at index " + j + " : " );
                barricade[j] = obj.nextInt();
            }
            barricades[i] = barricade;
            System.out.println( );
        }
        return barricades;
    }

    public static int findBlockedPeople(int barricades[][]){
        Set<Integer> hashSet = new HashSet<>();

        for (int[] cordinates : barricades) {
            for(int i = cordinates[0]; i<=cordinates[0]+cordinates[2];i++){
                hashSet.add(i);
            }
        }
        return hashSet.size();
    }
 
    public static void main(String[] args) {

        // int [][] barricades = {
        //     {1,2,3},
        //     {3,4,2},
        //     {2,3,2},
        //     {9,3,2},
        //     {11,3,2},
        // };

        // simper approch than the video;
        int [][] barricades = getInputs();

        System.out.println(findBlockedPeople(barricades));
        
    }



}
