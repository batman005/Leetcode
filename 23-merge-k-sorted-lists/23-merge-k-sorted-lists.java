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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(ListNode list: lists){
            while(list != null){
                pq.add(list.val);
                list = list.next;
            }
        }
        
        
        ListNode curr = new ListNode(0);
        ListNode head = curr;
        while(!pq.isEmpty()){
            ListNode t = new ListNode(pq.poll());
            curr.next = t;
            curr = curr.next;
        }
        return head.next;
        
    }
}