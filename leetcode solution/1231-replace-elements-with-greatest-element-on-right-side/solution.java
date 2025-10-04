class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=n-1 ; i>=0 ; i--){
            if(i==n-1){
                max = arr[i];
                ans[i] = -1;
                continue;
            } 

            int temp = arr[i];
            ans[i] = max;
            max = Math.max(max,temp);
        }
        return ans;
    }
}
