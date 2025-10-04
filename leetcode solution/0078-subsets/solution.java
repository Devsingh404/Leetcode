class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        helper(nums, ans, subset , 0);
        return ans;
    }

    public void helper(int nums[] , List<List<Integer>> ans , List<Integer> subset , int index){
        ans.add(new ArrayList<Integer>(subset));
        for(int i=index ; i<nums.length ; i++){

            subset.add(nums[i]);
            helper(nums,ans,subset,i+1);
            subset.remove(subset.size()-1);
        }
    }
}
