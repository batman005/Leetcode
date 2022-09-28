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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> nodes = new ArrayList();
        
        ListNode cur = head;
        while(cur != null) {
            nodes.add(cur);
            cur = cur.next;
        }
        
        if (nodes.size() <= 1) 
            return null; 
        
        int index = nodes.size() - n;
        if (index == 0) 
            return nodes.get(index).next;
        
        nodes.get(index-1).next = nodes.get(index).next;
        return head;
    }
    
}