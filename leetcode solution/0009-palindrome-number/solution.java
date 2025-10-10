class Solution {
    public boolean isPalindrome(int x) {
        int pal = 0;
        int y = x;
        while(y > 0){
            int temp = y % 10;
            pal = pal*10 + temp;
            y = y/10;
        }
        return(pal == x);
    }
}
