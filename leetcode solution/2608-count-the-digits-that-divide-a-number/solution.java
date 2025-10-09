class Solution {
    public int countDigits(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        int m = num;
        
        while(m>0){
            list.add(m%10);
            m = m/10;
        }
        
        int ans = 0;
        
        for(int el : list){
            if(el == 0){
                continue;
            } 
            
            if(num % el ==0) ans++;
        }
        
        return ans;
    }
}
