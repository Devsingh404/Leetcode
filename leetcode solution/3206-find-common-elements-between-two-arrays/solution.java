class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        int a = 0;
        int b = 0;

        for(int el : nums1){
            if(set2.contains(el)) a++;
        }
        for(int el : nums2){
            if(set1.contains(el)) b++;
        }

        return new int[]{a,b};
    }
}
