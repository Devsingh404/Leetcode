class Solution {
    public boolean scoreBalance(String s) {
        int n = s.length();
        if(n==0 || n==1) return false;
        int[] prefix = new int[n];

        for(int i=0 ; i<n ; i++){
            if(i==0){
                prefix[i] = s.charAt(i) - 'a' +1;
                continue;
            } 
            prefix[i] = prefix[i-1] + (s.charAt(i) - 'a' +1); 
        }
        
        int total = prefix[n-1];
        
        for(int i : prefix ){
            if(i == total - i) return true;
        }
        return false;
    }
}
