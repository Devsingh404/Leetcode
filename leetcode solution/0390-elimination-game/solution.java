class Solution {
    public int lastRemaining(int n) {
        return helper(n , 1 , true , 1);
    }

    public int helper(int n , int head , boolean left , int gap){
        if(n==1) return head;
        if(left) head += gap;
        else if(!left && n%2 != 0) head += gap;
        return helper(n/2 , head , !left , gap*2);
    }
}
