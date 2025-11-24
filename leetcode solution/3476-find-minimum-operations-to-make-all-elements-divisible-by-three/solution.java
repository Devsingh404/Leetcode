class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int operations = 0;
        for(int num : nums){
            if(num % 3 != 0) operations++;
        }
        return operations;
    }
}
