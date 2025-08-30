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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode mid=middle(head);
        ListNode rightHead=mid.next;
        mid.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(rightHead);
      return merge(left,right);
    }
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode head1,ListNode head2){
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        ListNode temp1=head1;
        ListNode temp2=head2;
        while(temp1!=null&&temp2!=null){
            if(temp1.val<=temp2.val){
                curr.next=temp1;
                temp1=temp1.next;
            }
            else{
                curr.next=temp2;
                temp2=temp2.next;
            }
            curr=curr.next;
        }
        if(temp1==null) curr.next=temp2;
        else curr.next=temp1;
        return dummy.next;
    }
}