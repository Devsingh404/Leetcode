class Solution {
    public boolean buddyStrings(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if(n != m) return false;

        boolean repeat = false;
        int[] repArr = new int[26];
        ArrayList<Integer> ind = new ArrayList<Integer>();
        
        for(int i=0 ; i<n ; i++){
            if(s.charAt(i) != goal.charAt(i)) ind.add(i);
            if(ind.size() > 2) return false;
            repArr[s.charAt(i) - 'a']++;
            if(repArr[s.charAt(i) - 'a'] > 1) repeat = true;
        }
        if(ind.size() > 2 || ind.size() == 1) return false;
        if(ind.size() == 0 && repeat == true) return true;
        if(ind.size() == 0 && repeat == false) return false;
        if(s.charAt(ind.get(0)) == goal.charAt(ind.get(1)) && s.charAt(ind.get(1)) == goal.charAt(ind.get(0))){
            return true;
        }
        return false;
    }
}
