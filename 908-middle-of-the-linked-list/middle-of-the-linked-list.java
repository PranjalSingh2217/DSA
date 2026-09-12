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
  
    public ListNode middleNode(ListNode head) {
        int count=1;
        ListNode start=head;
        while(head.next!=null){
            count++;
            head=head.next;
        }
        // if(count%2==0){
            for(int i=0;i<(count/2);i++){
               
                start=start.next;
            }
        // }
        // else{
        //     for()
        // }
 
    return start;        
    }
}