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
        ListNode prev=null;
        ListNode head=null;
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        //int count =1;
        while(A!=null){
            ListNode temp=new ListNode(A.val);
            if(!tm.containsKey(A.val)){  
                tm.add(A.val,1);
            }else{
                int count = tm.getValue(A.val);
                tm.add(A.val,count+1);
            }
            A=A.next;
        }
        
        return head;
    }
}

if(node==null){
                    node=temp;
                    prev=temp;
                    head=node;
                }else{
                    node.next=temp;
                    prev=node;
                    node=node.next;
                }else{
                    node=null;
                    prev.next=null;
                    node=prev;
                }
