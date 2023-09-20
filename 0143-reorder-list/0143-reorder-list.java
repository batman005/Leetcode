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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next== null){
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        
        ListNode slowPrev = null;
        while(fast != null && fast.next != null){
            slowPrev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        slowPrev.next = null;
        
        //slow -> is the head of 2nd list;
        
        
        //Reverse the 2nd list
        
        ListNode reverseHead = reverse(slow);
        
        ListNode mergedHead = new ListNode(-1);
        ListNode it = mergedHead;
        ListNode it1 = head;
        ListNode it2 = reverseHead;
        while(it1 != null && it2 != null){
            ListNode for1 = it1.next;
            it.next = it1;
            it1 = for1;
            
            it = it.next;
            
            ListNode for2 = it2.next;
            it.next = it2;
            it2 = for2;
            it = it.next;
        }
        head = mergedHead.next;
        return;
    }
    
    private ListNode reverse(ListNode slow){
        ListNode prev = null;
        ListNode curr = slow;
        while(curr != null){
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
}