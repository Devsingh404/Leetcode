class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int answer = 0;
        for(String s : operations){
            if(s.equals("++X") || s.equals("X++")){
                answer ++;
                continue;
            }
            else answer--;
        }
        return answer;
    }
}
