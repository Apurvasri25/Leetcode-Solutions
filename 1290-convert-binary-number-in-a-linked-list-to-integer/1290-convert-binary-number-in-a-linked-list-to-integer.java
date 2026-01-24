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
    public int getDecimalValue(ListNode head) {
        ListNode ptr = head;
        if(head==null){
            return 0;
        }
        int count =-1;
        while(ptr!=null){
            count++;
            ptr=ptr.next;
        }

        int val =0;
        ptr=head;
        while(ptr!=null && count>=0){
            val+= ptr.val *(Math.pow(2,count--));
            ptr=ptr.next;
        }

        return val;
        
    }
}