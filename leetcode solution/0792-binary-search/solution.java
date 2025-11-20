class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return helper(nums , target , 0 , n-1);
    }
    public int helper(int[] nums , int target , int left , int right){
        if(left>=right && nums[left] != target) return -1;
        int mid = (left + right) / 2;

        if(nums[mid] == target){
             return mid;
        }
        else if(nums[mid] < target){
            return helper(nums , target , mid+1 , right);
        }
        else {
            return helper(nums , target , left , mid-1);
        }
    }
}
