class Solution {
    public int nextBeautifulNumber(int n) {
        boolean flag = false;
        int num = n;
        int ans = 0;
        while(flag == false){
            HashMap<Integer,Integer> map = new HashMap<>();
            num++; 
            int temp = num;
            while(temp > 0){
                int digit = temp % 10;
                map.put(digit , map.getOrDefault(digit , 0) + 1);
                temp = temp/10;
            }
            for(Map.Entry<Integer,Integer> entry : map.entrySet() ){
                int a = entry.getKey();
                int b = entry.getValue();
                if(a != b){
                    flag = false;
                    ans = 0;
                    break;
                } 
                else{
                    flag = true;
                    ans = num;
                }
            }
        }
        return ans;
    }
}
