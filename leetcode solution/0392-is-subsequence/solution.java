class Solution {
    public boolean isSubsequence(String s, String t) {
        int sublen = s.length();
        int len = t.length();
        int i = 0;
        int j = 0;
        if( s.equals("")) return true;
        while(i<len && j<sublen){
            if(s.charAt(j)==t.charAt(i)){
                if(j==sublen-1) return true;
                i++;
                j++;
            }else{
                i++;
            }

        }
        return false;
    }
}
