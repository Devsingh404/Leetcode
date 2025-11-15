class Solution {
    public int scoreOfString(String s) {

        int n = s.length();
        int ans = 0;

        for(int i=0 ; i<n-1 ; i++){
            int num1 = s.charAt(i);
            int num2 = s.charAt(i+1);
            ans += Math.abs(num1-num2);
        }

        return ans;
    }
}
