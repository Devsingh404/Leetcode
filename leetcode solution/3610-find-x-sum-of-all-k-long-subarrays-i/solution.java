class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length - k + 1;
        int[] ans = new int[n];
        for(int i=0 ; i<n ; i++){
            int[] freq = new int[51];
            for (int j = i; j < i + k; j++) {
                freq[nums[j]]++;
            }
            int[][] arr = new int[51][2];
            for (int val = 1; val <= 50; val++) {
                arr[val][0] = val;
                arr[val][1] = freq[val];
            }

            Arrays.sort(arr, (a, b) -> {
                if (a[1] == b[1]) return a[0] - b[0];
                return a[1] - b[1];
            });

            int count = 0, sum = 0;
            for (int v = 50; v >= 1 && count < x; v--) {
                if (arr[v][1] > 0) {
                    sum += arr[v][0] * arr[v][1];
                    count++;
                }
            }

            ans[i] = sum;
        }
        return ans;
    }
}
