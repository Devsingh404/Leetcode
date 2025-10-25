class Solution {
    public int totalMoney(int n) {
        int ans = 0;
        int weeks = n / 7;
        int rem = n % 7;
        if(weeks > 0){
            for(int i=1 ; i<=weeks ; i++){
                ans = ans + 28 + (i-1) * 7;
            }
        } 
        int temp = weeks + 1;
        while(rem > 0){
            ans += temp;
            temp++;
            rem--;
        }
        return ans;
    }
}
