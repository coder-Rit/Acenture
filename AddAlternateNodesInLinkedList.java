import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;





// * https://youtu.be/Llbg5ibnvjw?si=oXuXMI-ZQfVZ4cSc



/*
 * 
 * Add Alternate Nodes in Linked List :
 * There is a singly linked list represented by the following structure :

    *Struct Node {
    *    int val;
    *    Struct Node* next;
    *}

    * Implement the following function :
    
    Struct Node* AddAlternateNodes( struct Node* head);

    The function accepts a pointer to the start of the linked list, 'head' as its
    argument. Implement the function to modify the given list in such a way that
    original value of each node is added to the value of next node and return the
    modified list.

    * Note :
        • Return null if list is null.
        • Just modify the input linked list ,
        • 1st and 2nd node values remain unchanged.

 */



 /*
  
    * Example :
        Input :
        1 > 2 → 3 → 4 → 5 → 6 →> 7
        Output :
        1 → 2 →> 4 → 6 →> 8 →> 10 > 12
    * Explanation :
        Adding original value of the node to its next to next node, upton
        Replace value of '3' with 1+3 = 4
        Replace value of '4' with 2 + 4 = 6
        Replace value of '5' with 3 + 5 = 8
        Replace value of '6' with 4 + 6 = 10
        Replace value of '7' with 5+ 7 = 12
        Thus obtained linked list is 1 > 2-> 4-> 6 -> 8 -> 10 -> 12

  */


// output
/*
 
Enter the number of nodes : 7
Enter value at node 1 : 1

Enter value at node 2 : 2

Enter value at node 3 : 3

Enter value at node 4 : 4

Enter value at node 5 : 5

Enter value at node 6 : 6

Enter value at node 7 : 7

1 2 3 4 5 6 7
1 2 4 6 8 10 12
 
 */


class ListNode {
    int val ;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}

public class AddAlternateNodesInLinkedList {


     public static ListNode getInputs(){
         Scanner obj = new Scanner(System.in);

         System.out.print("Enter the number of nodes : " );
         int n = obj.nextInt();

         ListNode head = new ListNode(-1);
         ListNode curr = head;

         for(int i =0; i<n; i++){
            System.out.print("Enter value at node " + (i+1) + " : " );
            int num = obj.nextInt();
            curr.next = new ListNode(num);
            curr = curr.next;
            System.out.println( );
        }
        return head.next;
    }

    public static ListNode addNodes (ListNode head){
        Queue<Integer> q = new LinkedList<>();

        if(head ==null || head.next==null || head.next.next == null){
            return head;
        }

        ListNode left = head;
        ListNode mid = head.next;
        ListNode right = mid.next;

        while(right!=null){
            q.add(left.val+right.val);

            left = mid;
            mid = right;
            right= right.next;
        }
        ListNode curr = head;
        curr = curr.next.next;

        while(!q.isEmpty()  ){
            curr.val= q.poll();
            curr = curr.next;
        }

        return head;
    }

    public static void ListNodePrinter(ListNode head){
        ListNode curr = head;
        while(curr!=null){
            System.out.print(curr.val +" ");
            curr = curr.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
       
        ListNode head = getInputs();
        ListNodePrinter(head);
        ListNodePrinter(addNodes(head));




    }
}
