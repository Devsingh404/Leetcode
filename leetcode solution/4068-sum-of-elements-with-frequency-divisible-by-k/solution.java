class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
        }
        int sum = 0;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            if(freq % k == 0){
                sum += (num*freq);
            }
        }
        return sum;
    }
}
