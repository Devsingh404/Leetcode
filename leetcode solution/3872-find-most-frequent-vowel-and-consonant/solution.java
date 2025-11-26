class Solution {
    public int maxFreqSum(String s) {
        int n = s.length();
        int vmax = 0;
        int cmax = 0;
        int[] letters = new int[26];
        for(int i=0 ; i<n ; i++){
            char ch = s.charAt(i);
            letters[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            int freq = letters[i];
            char ch = (char) (i + 'a');

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vmax = Math.max(vmax, freq);
            } 
            else {
                cmax = Math.max(cmax, freq);
            }
        }
        return vmax + cmax;
    }
}
