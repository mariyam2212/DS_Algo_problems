class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> pq=new TreeSet<>();
        int ans=nums[0];
        for(int i =0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        if(pq.size()<3){
            ans=pq.pollLast();
        }else{
        int k = pq.size() - 3;
            while(k>=0){
                ans=pq.pollFirst();
                k--;
            } 
        }
        return ans;
    }
}