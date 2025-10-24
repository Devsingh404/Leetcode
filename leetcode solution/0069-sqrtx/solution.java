class Solution {
    public int mySqrt(int x) {
        long l = 1; 
        long h = x; 
        if (x == 0 || x == 1) { return x; }

        while (l<h) {
            long m =  l + (h-l)/2 ; 
            long ans = m * m;  
            if (ans == (long) x ) { return (int) m; }
            else if (ans > x){  h = m-1; }
            else { l = m +1; }
        }
        
        return (long) h * h > x ? (int) h - 1 : (int) h; 
    }
}
