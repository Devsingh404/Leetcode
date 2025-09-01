class Solution {
    public int reverse(int x) {

        int temp = x;
        long answer = 0;
        while(temp != 0){
            int digit = temp%10;
            answer = answer*10 + digit;
            temp = temp/10;
            if(answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) return 0;
        }
        return (int)answer;
    }
}
