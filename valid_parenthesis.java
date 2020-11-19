class Solution {
    public boolean isValid(String s) {
       char arr[]=s.toCharArray();
        Stack<Character> st=new Stack<>();
        boolean isv=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='(' || arr[i]=='{' || arr[i]=='[')
                st.add(arr[i]);
            else{
                if(!st.isEmpty()){
                    if(isRight(st.pop(),arr[i]))
                        isv=true;
                    else{
                        isv=false;
                        break;
                    }
                    }else{
                     isv=false;
                        break;
                }
            }
        }
        if(!st.isEmpty())
            isv=false;
        return isv;
    }
    public boolean isRight(char c1,char c2){
        HashMap<Character,Character> hm = new HashMap<>();
        hm.put('(',')');
        hm.put('[',']');
        hm.put('{','}');
        if(hm.get(c1) == c2)
            return true;
        else
            return false;
    }
}