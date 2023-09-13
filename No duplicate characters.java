class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }

        int num=1;
        int max=1;
        for(int i=1;i<s.length();i++){
            int index=s.indexOf(s.charAt(i),i-num);
            if(index<i){
                num=i-index;
            }else{
                num+=1;
            }
            max=Math.max(max,num);//每次循环都找到最优解
        }
        return max;
       

    }
}
