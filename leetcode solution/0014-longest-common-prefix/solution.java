class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String pref = "";
        if(n==0) return pref;
        Arrays.sort(strs);
        
        String first = strs[0];
        String last = strs[n-1];
        
        int i=0 ; 
        int j=0 ; 
        while(i<first.length() && j<last.length()){
            if(first.charAt(i) == last.charAt(j)){
                pref = pref+first.charAt(i);
                i++;
                j++;
            }
            else break;
        }
        return pref;
    }
}
