class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int answer = 0;
        while(i<j){
            answer = Math.max( answer , (j-i) * Math.min(height[i] , height[j]) );
            if(height[i] <= height[j]) i++;
            else j--;
        }
        return answer;
    }
}
