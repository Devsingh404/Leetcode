class Solution {
    public int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);
        int len = s.length();
        int i=0;
        int j=len-1 ;
        int ans = 0;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                ans+=2;
            }
            i++;
            j--;
        }
        return ans;
    }
}
