package W1Day5;

public class ListNode {
    int val;
    ListNode next;

    ListNode(ListNode next) {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


class Solution {
   static public ListNode reverseList(ListNode head) {
       ListNode N = head.next;
       ListNode P = head.next;              //O(1)
       while (N.next!= null) {
           N = reverseList(head.next);          //O(!n)
           P.next = head;
           head.next = null;
           break;
       }
       if (N.next==null) {
           N.next = head;
           head.next = null;
       }

       return N;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1, new ListNode(2,null));
        Solution.reverseList(l);
    }
}
