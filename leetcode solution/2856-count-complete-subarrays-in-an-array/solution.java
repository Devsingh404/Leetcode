class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        int k = (int) Arrays.stream(nums).distinct().count();
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0, unique = 0, ans = 0;

        for(int right = 0; right<n; right++){
            freq.put(nums[right] , freq.getOrDefault(nums[right] , 0) + 1);
            if(freq.get(nums[right]) == 1) unique++;

            while(unique == k){
                ans += n - right;

                freq.put(nums[left] ,freq.getOrDefault(nums[left] , 0) - 1);
                if(freq.get(nums[left]) == 0) unique--;
                left++;
            }
        }

        return ans;
    }
}
