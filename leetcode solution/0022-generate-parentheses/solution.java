class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> arr = new ArrayList<String>();
        StringBuilder s = new StringBuilder();
        helper(0 , 0 , n , arr , s);
        return arr;
    }
    
    public void helper( int open , int close , int n , List<String> arr , StringBuilder s){
        if(s.length()==2*n){
            arr.add(s.toString());
            return;
        }
        if(open<n){
            s.append('(');
            helper(open+1 , close , n , arr , s);
            s.deleteCharAt(s.length() - 1);
        }
        if(close < open){
            s.append(')');
            helper(open , close+1 , n , arr , s);
            s.deleteCharAt(s.length() - 1);
        }
    }
}
