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
    public boolean isPalindrome(ListNode head) {
        Boolean res=false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=slow;
        ListNode curr=slow.next;
        while(curr!=null){
            ListNode Next=curr.next;
            curr.next=prev;

            //update
            prev=curr;
            curr=Next;
        }
        slow.next=null;
        curr=prev;
        ListNode temp=head;

       while(curr!=null){
        if(curr.val!=temp.val){
            return res;
        }
        temp=temp.next;
        curr=curr.next;
       }
       res=true;
        return res;
    }
}