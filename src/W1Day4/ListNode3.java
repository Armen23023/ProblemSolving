package W1Day4;
  public class ListNode3 {
      int val;
      ListNode3 next;
      ListNode3() {}
      ListNode3(int val) { this.val = val; }
      ListNode3(int val, ListNode3 next) { this.val = val; this.next = next; }
  }

class Solution3 {
    public ListNode3 deleteDuplicates(ListNode3 head) {
        ListNode3 h = head;
        while (head.next!=null){
            if (head.val == head.next.val){
                head.next = head.next.next;         // O(n)
            }
            else head = head.next;
        }
        return h;
    }
  }