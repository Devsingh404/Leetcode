class Solution {
    public int minimumSwap(String s1, String s2) {
        int n = s1.length();
        int countxy = 0;
        int countyx = 0;
        
        for(int i=0 ; i<n ; i++){
            if(s1.charAt(i) == 'x' && s2.charAt(i) == 'y'){
                countxy++;
            }
            else if(s1.charAt(i) == 'y' && s2.charAt(i) == 'x'){
                countyx++;
            }
            
        }
        if((countxy+countyx)%2 != 0) return -1;
        return (countyx/2 + countxy/2) + 2 * (countyx%2);
    }
}
