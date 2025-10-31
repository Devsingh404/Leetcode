class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq = new int[100];
        int[] ans = new int[2];
        for(int i=0 ; i<nums.length ; i++){
            freq[nums[i]]++;
        }
        int i=0;
        int j=0;
        while(i<2 || j<100){
            if(freq[j]>1){
                ans[i] = j;
                j++;
                i++;
                continue;
            }
            j++;
        }
        return ans;
    }
}
