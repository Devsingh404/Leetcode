class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<Integer>();
        int maxarea=0;
        int n = heights.length;
        
        for(int i=0 ; i<n ; i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                int el = st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                maxarea = Math.max(maxarea,heights[el]*(nse-pse-1));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int nse = n;
            int element = st.pop();
            int pse = st.isEmpty() ? -1 : st.peek();
            maxarea = Math.max(maxarea,heights[element]*(nse-pse-1));
        }
        return maxarea;
    }
}
