class Solution {
    public double myPow(double x, int n) {
        if (n < 0) {
            return 1.0 / helper(x, -n);
        } else {
            return helper(x, n);
        }
    }

    double helper(double x, int n){
        if(n==1) return x;
        if(n==0) return 1;
        
        double half = helper(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
