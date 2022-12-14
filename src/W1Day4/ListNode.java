package W1Day4;
  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

 class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headA.next != null){
            while (headB.next != null) {
                if (headA == headB) {           //O(n*n)
                    return headA;
                }
                headB = headB.next;
            }
            headA = headA.next;
        }
        return null;
    }
}
