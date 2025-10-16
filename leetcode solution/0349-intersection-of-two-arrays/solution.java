class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(nums1[i] == nums2[j]) set.add(nums1[i]);
            }
        }
        int len = set.size();
        if(len == 0) return new int[0];
        int[] ans = new int[len];
        int i=0;
        for(int el : set){
            ans[i] = el;
            i++; 
        }
        return ans;
    }
}
