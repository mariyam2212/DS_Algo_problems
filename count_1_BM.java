public class Solution {
    public int numSetBits(long a) {
        int count = 0;
        if(a==0)
            return 0;
        while(a!=0){
            a=a & (a-1);
            count ++;
        }
        return count;
    }
}
