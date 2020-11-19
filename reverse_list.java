/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        if(B==C)
            return A;
        ListNode temp=A;
        ListNode node=A;
        ListNode anshead = null;
        ListNode ans = null;
        Stack<Integer> st = new Stack<>();
        int k =1;
        
        while(temp!=null){
            if(k>=B && k<=C)
                st.add(temp.val);
            temp=temp.next;
            k++;
        }
        int l = 1;
        while(node != null){
           if(l>=B && l<=C){
             
               ListNode n = new ListNode(st.pop());
               if(ans==null){
                   ans=n;
                   anshead=ans;
               }else{
                ans.next=n;
               ans=ans.next;
               }
           }else{
               if(ans==null){
                   ans=node;
                   anshead=ans;
               }else{
                   ans.next=node;
                   ans=ans.next;
               }
           }
           l++;
           node=node.next;
        }
        return anshead;
    }
}
