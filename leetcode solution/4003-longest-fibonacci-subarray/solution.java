class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1 || n==2) return n;
        int max = 2;
        int temp=2;
        for(int i=2 ; i<n ; i++){
            if(nums[i-1] + nums[i-2] == nums[i]){
                temp++;
                max = Math.max(max,temp);
            }
            else temp = 2;
        }

        return max;
    }
}
