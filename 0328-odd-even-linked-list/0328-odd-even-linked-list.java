/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
       if(head == null)
       return null;
  
        ListNode odd = head, even = head.next, evenHead = even;

           try {
        
            while (odd.next != null ) {
                odd.next = even.next;
                if(odd.next!=null)
                odd = odd.next;
                even.next = odd.next;
                if(even.next!=null)
                even = even.next;
            }
        }catch (NullPointerException ignored){

        }
        odd.next = evenHead;
        return head;  
    }
}