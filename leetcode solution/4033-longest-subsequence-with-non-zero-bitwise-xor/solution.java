class Solution {
    public int longestSubsequence(int[] nums) {
        boolean flag = true;
        int n = nums.length;
        for(int i=0 ; i<n ; i++){
            if(nums[i]!=0){                
                flag = false;
                break;                
            }
        }
        if(flag == true) return 0;

        int xor = 0;

        for(int num : nums){
            xor = xor ^ num;
        }

        if(xor == 0) return n-1;
        else return n;
    }
}
