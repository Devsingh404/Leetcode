class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int x : nums) {
            if (x < pivot) less.add(x);
            else if (x == pivot) equal.add(x);
            else greater.add(x);
        }

        int[] ans = new int[n];
        int idx = 0;

        for (int x : less) ans[idx++] = x;
        for (int x : equal) ans[idx++] = x;
        for (int x : greater) ans[idx++] = x;

        return ans;
    }
}
