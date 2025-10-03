class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int total = 0;
        int left = 0;
        int right = n-1;
        int Lmax = 0;
        int Rmax = 0;
        while(left<right){
            if(height[left] <= height[right]){
                if(Lmax>height[left]) total += Lmax-height[left];
                else Lmax = height[left];
                left++;
            }else{
                if(Rmax>height[right]) total += Rmax-height[right];
                else Rmax = height[right];
                right--;
            }
        }
        return total;
    }
}
