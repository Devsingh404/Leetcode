class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            if(freq == 1){
                sum += num;
            }
        }
        return sum;
    }
}
