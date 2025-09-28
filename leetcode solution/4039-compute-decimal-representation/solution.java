class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int place = 1;
        while(n>0){
            int unit = n%10;
            if(unit>0) nums.add(unit*place);
            place = place*10;
            n = n / 10;
        }

        int size = nums.size();
        int[] answer = new int[size];
        for(int i=size-1 ; i>=0 ; i--){
            answer[size - i - 1] = nums.get(i);
        }
        return answer;
    }
}
