/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode result=null;
        if(A==null)
            return B;
        if(B==null)
            return A;
        if(A.val<=B.val){
            result = A;
            result.next=mergeTwoLists(A.next,B);
        }else{
            result = B;
            result.next=mergeTwoLists(A,B.next);
        }
        return result;
    }
}
