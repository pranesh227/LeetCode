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
        ListNode temp = head;
        int count =0;
        // if(temp.next == null) return head.next;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        temp = head;
        n = count-n;
        if(n==0) return head.next;
        for(int i=1;i<n;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}