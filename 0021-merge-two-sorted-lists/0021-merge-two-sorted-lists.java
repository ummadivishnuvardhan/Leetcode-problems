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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
        ListNode temp1=list1;
        ListNode temp2=list2;
        while(temp1!=null&&temp2!=null){
            if(temp1.val<=temp2.val){
                tail.next=temp1;
                temp1=temp1.next;
            }
            else{
                tail.next=temp2;
                temp2=temp2.next;
            }
            tail=tail.next;
        }   
        if(temp1==null){
            tail.next=temp2;
        }
        else if(temp2==null){
            tail.next=temp1;
        }
        return dummy.next;
    }
}