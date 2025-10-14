class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int temp = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        while(i<n){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                i = map.get(ch) + 1;
                map.clear();
                temp = 0;
                continue;                
            }
            temp++;
            ans = Math.max(ans,temp);
            map.put(ch,i);
            i++;
        }
        return ans;
    }
}
