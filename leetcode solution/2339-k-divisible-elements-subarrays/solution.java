class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        int n = nums.length;
        int total = 0;
        Set<List<Integer>> set = new HashSet<>();
        
        for(int i=0; i<n ; i++){
            int count = 0;
            List<Integer> list = new ArrayList<>();
            for(int j=i ; j<n ; j++){
                if(nums[j] % p == 0) count++;
                if(count > k) break;
                
                list.add(nums[j]);
                set.add(new ArrayList<>(list));
            }
        }
        return set.size();
    }
    
}
