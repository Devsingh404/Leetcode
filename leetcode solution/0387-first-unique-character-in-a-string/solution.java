class Solution {
    public int firstUniqChar(String s) {
        int[] chArr = new int[26];
        for(int i=0 ; i<26 ; i++){
            chArr[i] = -2;
        }

        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);

            if (chArr[ch - 'a'] == -2) {
                chArr[ch - 'a'] = i; 
            } 
            else if (chArr[ch - 'a'] > -1) {
                chArr[ch - 'a'] = -1;
            }
        }

        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);

            if(chArr[ch - 'a'] > -1) return chArr[ch - 'a'];
        }

        return -1;
    }
}
