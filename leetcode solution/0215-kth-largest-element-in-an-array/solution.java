class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = nums.length;
        for(int i=0 ; i<n ; i++){
            pq.offer(nums[i]);
        }
        int ans = -1;
        while(!pq.isEmpty()){
            int temp = pq.poll();
            k--;
            if(k==0) ans = temp;
        }
        return ans;
    }
}
