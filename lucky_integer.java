class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(hs.containsKey(arr[i])){
                int count = hs.get(arr[i])+1;
                hs.put(arr[i],count);
            }else{
                hs.put(arr[i],1);
            }
        }
        int max = -1;
        for(Map.Entry me:hs.entrySet()){
            int key = (int)me.getKey();
            int value=(int)me.getValue();
            if((key == value) && (key>max))
                max=key;
        }
        return max;
    }
}