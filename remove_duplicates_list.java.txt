/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode node=null;
        ListNode head=null;
        HashSet<Integer> hs=new HashSet<>();
        
        while(A!=null){
            if(!hs.contains(A.val)){
                ListNode temp=new ListNode(A.val);
                  hs.add(A.val);
                  if(node==null){
                      node=temp;
                      head=node;
                  }else{
                      node.next=temp;
                      node=node.next;
                  }
            }
              A=A.next;
        }
        return head;
    }
}
