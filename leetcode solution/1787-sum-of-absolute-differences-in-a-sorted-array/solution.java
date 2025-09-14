class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i=1 ; i<n ; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        int[] answer = new int[n];
        for(int i=0 ; i<n ; i++){
            int left = ((i+1) * nums[i]) - (prefix[i]);
            int right = (prefix[n-1] - prefix[i]) - ((n-i-1)*nums[i]);
            answer[i] = left + right;
        }
        return answer;
    }
}
