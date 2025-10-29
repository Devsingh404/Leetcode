class Solution {
    public int smallestNumber(int n) {
        String binary = Integer.toBinaryString(n);
        int bits = binary.length();
        StringBuilder sb = new StringBuilder("");
        while(bits>0){
            sb.append('1');
            bits--;
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
