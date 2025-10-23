class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0 ; i<n ; i++){
            int num = nums[i];
            int needmore = target - num;
            if (map.containsKey(needmore)){
                ans[0] = i;
                ans[1] = map.get(needmore);
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}
