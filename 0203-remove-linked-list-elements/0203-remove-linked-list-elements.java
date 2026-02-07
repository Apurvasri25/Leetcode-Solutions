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
    public ListNode removeElements(ListNode head, int target) {
        
        if(head==null) return head;// handle edge case explicitly
        
        ListNode prev = head; // tracking previous node of temp
        ListNode temp = head.next;// current node

        // temp would start from second element
        while(temp!=null){

            if(temp.val==target){
                // skipping the element by adding bridge from previous node to the next node
                prev.next = temp.next;
                temp = temp.next;
            }
            else{
                // just move both of them
                prev = temp;
                temp = temp.next;
            }  
        }
        
        // as we skipped the head initially ,check it at the last
        if(head.val==target)
        head = head.next;

        return head;
    }
}