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
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }
        
        ListNode Odd = head;
        ListNode Even = head.next;
        
        ListNode EvenHead = Even;
        
        while(Odd.next != null && Even.next != null){
            ListNode OddNext = Even.next;
            Odd.next = OddNext;
            Odd = Odd.next;
            
            if(Odd != null){
                Even.next = Odd.next;
                Even = Even.next;
            }
        }
        
           Odd.next = EvenHead;
        
        return head;
    }
}