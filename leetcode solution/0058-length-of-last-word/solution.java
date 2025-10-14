class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int ans = 0;
        for(int i=n-1 ; i>=0 ; i--){
            if(s.charAt(i) == ' '){
                continue;
            } 
            ans++;
            if((i-1 >= 0) && s.charAt(i-1) == ' '){
                break;
            }

        }
        return ans;
    }
}
