class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        if(nums.length==1)return 0;
        if(nums[start]>nums[start+1])return start;
        if(nums[end]>nums[end-1])return end;
        return peak(nums,start+1,end-1);
        
    }
    public int peak(int[] nums,int st,int en){
        if(st>en) return -1;
        int mid = (st+en)/2;
        if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]) return mid;
        int a = peak(nums,mid+1,en);
        int b = peak(nums,st,mid-1);
        return Math.max(a,b);
    } 
}
