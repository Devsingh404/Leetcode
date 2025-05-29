class Solution {
    public boolean canDistribute(int[] nums, int[] quantity) {
       
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int el : nums){
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        List<Integer> quantityList = new ArrayList<>();
        for(int q : quantity){
            quantityList.add(q);
        }
        quantityList.sort( Collections.reverseOrder());
        return helper(map , quantityList,0);
    }

    public boolean helper(Map<Integer,Integer> map,List<Integer> quantityList, int index){
        if (index >= quantityList.size()) return true;

        int required = quantityList.get(index);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int available = entry.getValue();

            if (available >= required) {
                map.put(key, available - required);

                if (helper(map, quantityList, index + 1)) {
                    return true;
                }

                map.put(key, available);
            }
        }

        return false;
    }
}
