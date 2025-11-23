class Solution {
    public long sumAndMultiply(int n) {
        
        String s = String.valueOf(n);
        long num = 0;
        long sum = 0;
        int len = s.length();
        
        for(int i=0 ; i<len ; i++){
            char ch = s.charAt(i);
            if(ch != '0'){
                num = (num*10) + (ch - '0') ;
                sum += (ch - '0') ;
            }
        }
        return sum * num;
    }
}
