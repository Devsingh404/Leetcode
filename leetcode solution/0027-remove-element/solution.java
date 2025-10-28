class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1){
            if(val == nums[0])return 0;
            return 1;
        } 
        int i=0 ; int j=n-1;
        int ans = 0;
        while(i<=j){
            if(nums[i]==val){
                while(nums[j]==val){
                    if(j==i) break;
                    j--;
                }
                if(j==i) break;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
                i++;
                ans++;
            }else{
                ans++;
                i++;
            }
        }
        return ans;
    }
}
