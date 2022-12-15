package W1Day4;
  public class ListNode2 {
      int val;
      ListNode2 next;
      ListNode2() {}
      ListNode2(int val) { this.val = val; }
      ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
  }

class Solution2 {
    static public ListNode2 removeElements(ListNode2 head, int val) {
        ListNode2 h  = head;                    //Space -> O(1)
        if(head == null) return null;
        while (head!=null) {
            if (head.val == val) {              //O(n)
                head = head.next;
                h= head;
            }
            else{
                break;
            }
        }
        while (h!=null){
            if (h.next==null && h.val == val){
                h=null;                                    //0(n)
                break;
            }
            if ( h.next!=null &&h.next.val == val){
                h.next = h.next.next;
            }
            else h = h.next;
        }
        return head;
    }
}
