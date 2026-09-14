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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev=head;
        while(head!=null && head.val==val){
     
            head=head.next;
            prev.next=null;
 

        }
        
        ListNode newPrev=head;
        while(newPrev!=null && newPrev.next!=null){
            if(newPrev.next.val==val){
                ListNode rem=newPrev.next;
                newPrev.next=rem.next;
                rem.next=null;
               
            }
            else{
                             newPrev=newPrev.next;

            }
            
        }
        return head; 
    }
}