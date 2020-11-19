/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int solve(ListNode A, int B) {
        LinkedList<Integer> li = new LinkedList<>();
        ListNode C=A;
        while(A!=null){
            li.add(A.val);
            A=A.next;
        }
           
            
        int mid = (li.size())/2 +1;
        int n = mid - B;
        if(n<=0)
            return -1;
            
        ListNode temp = null;
        
        while(n>0){
            if(temp==null)
                temp=C;
            else
                temp=temp.next;
            n--;
        }
        
        return temp.val;
    }
}
