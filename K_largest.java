import java.util.*;
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> al = new ArrayList<>();
        
        Integer arr[]=new Integer[A.size()];
        for (int i = 0; i < A.size(); i++){
            arr[i]=A.get(i);
        }
        Arrays.sort(arr, Collections.reverseOrder());
 
        for(int j = 0;j<B;j++)
            al.add(arr[j]);
        return al;
    }
}
