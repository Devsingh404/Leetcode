class Solution {
    public int strStr(String haystack, String needle) {
        int haylen = haystack.length();
        int needlen = needle.length();
        if(haystack.equals(needle)) return 0;
        if(needlen>haylen) return -1;
        for(int i=0 ; i<=haylen-needlen ; i++){
            for(int j=0 ; j<needlen ; j++){
                if(needle.charAt(j)!=haystack.charAt(j+i)) break;
                if(j==needlen-1) return i;
            }
        }
        return -1;
    }
}
