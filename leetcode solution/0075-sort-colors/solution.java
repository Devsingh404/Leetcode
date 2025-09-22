class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            int l = nums[low];
            int m = nums[mid];
            int h = nums[high];

            if(m==0){
                nums[low] = m ;
                nums[mid] = l;
                low++;
                mid++;
            }else if(m==1) mid++;
            else{
                nums[high] = m;
                nums[mid] = h;
                high--;
            }
        }
    }
}
