import java.util.Arrays;

class Solution {
    public int[] lexSmallestNegatedPerm(int n, long target) {

        long S = (long)n * (n + 1) / 2;
        long need = S - target;

        if (need < 0 || (need & 1L) == 1L) return new int[0];

        int[] ans = new int[n];
        int idx = 0;

        for (int i = n; i >= 1; i--) {
            if (need >= 2L * i) {
                ans[idx++] = -i;
                need -= 2L * i;
            } else {
                ans[idx++] = i;
            }
        }

        if (need != 0) return new int[0];

        Arrays.sort(ans);
        return ans;
    }
}

