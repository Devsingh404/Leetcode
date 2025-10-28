class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int[] ans = new int[1];
        for(int i=0 ; i<n ; i++){
            if(nums[i]==0){
                helper(nums.clone() , ans , i , true);
                helper(nums.clone() , ans , i , false);
            }
        }
        return ans[0];
    }

    public void helper(int[] nums , int[] ans , int i , boolean right){
        int n = nums.length;
        while(i>=0 && i<n){
            if(right == true){
                if(nums[i]==0) i++;
                else if(nums[i]>0){
                    right = false;
                    nums[i]--;
                    i--;
                }
            }
            else if(right == false){
                if(nums[i]==0) i--;
                else if(nums[i]>0){
                    right = true;
                    nums[i]--;
                    i++;
                }
            }
        }
        if(check(nums) == true) ans[0]++;
        
    }

    public boolean check(int[] nums){
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] != 0) return false;
        }
        return true;
    }
}
