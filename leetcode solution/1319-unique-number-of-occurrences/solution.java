class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int a : arr){
            hm.put(a, hm.getOrDefault(a,0)+1);
        }
        Set<Integer> hs = new HashSet<>();
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(hs.contains(entry.getValue()))return false;
            hs.add(entry.getValue());
        }
        return true;
    }
}
