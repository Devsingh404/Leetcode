class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = order.length;
        int[] ans = new int[friends.length];
        int i = 0;
        for(int num : order){
            for(int temp : friends){
                if(num == temp){
                    ans[i] = num;
                    i++;
                }
            }
        }
        return ans;
    }
}
