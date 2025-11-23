class Solution {
    public int kthGrammar(int n, int k) {
        if(n == 1) return 0;

        long half = (long)(Math.pow(2, n - 1) / 2);

        if (k <= half) {
            return kthGrammar(n - 1, k);
        } else {
            return inverse(kthGrammar(n - 1, (int)(k - half)));
        }
    }
    public int inverse(int a){
        if(a==0) return 1;
        else return 0;
    }
}
