class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkl");
        list.add("mno");
        list.add("pqrs");
        list.add("tuv");
        list.add("wxyz");
        List<String> ans = new ArrayList<String>();
        
        if (digits.length() == 0) return ans;

        StringBuilder word = new StringBuilder();
        helper(list , digits , ans , 0 , word);
        return ans;
    }

    public void helper(List<String> list , String digits , List<String> ans ,int i , StringBuilder word){
        if(i==digits.length()){
            ans.add(word.toString());
            return;
        } 

        int digit = digits.charAt(i) - '0';

        String letters = list.get(digit-2);
        int len = letters.length();
        for(int j=0 ; j<len ; j++){
            char ch = letters.charAt(j);
            word.append(ch);
            helper(list , digits , ans , i+1 , word);
            word.deleteCharAt(word.length() - 1);
        }
    }
}
