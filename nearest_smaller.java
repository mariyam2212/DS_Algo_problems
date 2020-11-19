public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        int smallest = A.get(0);
        ArrayList<Integer> B=new ArrayList<Integer>();
        Stack<Integer> st=new Stack<>();
        
        for(int i =0;i<A.size();i++){
            
            while(!st.isEmpty() && st.peek() > A.get(i))
            st.pop();
            
            if(st.isEmpty())
                B.add(-1);
            else
                B.add(st.peek());
            st.push(A.get(i));
        }
      //  System.out.println(B);
        return B;
    }
}
