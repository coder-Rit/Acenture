import java.util.Scanner;

public class Cards {

    // source
   //*  https://youtu.be/kOV_0ebkQeM?si=nXK_Dp0nWQPHPBp_


    // Calculate number of cards required to build "Card House" 
    public static int getInputs(){
        System.err.print("Enter Level of Cards House:");
        Scanner obj = new Scanner(System.in);
        return obj.nextInt();
    }
    
    public static void calculationLogic (int level){
        int totalCard = 0;
        for(int i =1; i<=level;i++){
            totalCard += (i*2)+i;
        }
        
        System.err.print("You will need " + (totalCard-level) +  " Cards to build "+ level + " Level of Cards House");
    }

    public static void main(String args[]){
        int level = getInputs();
        calculationLogic(level);
    }
}
