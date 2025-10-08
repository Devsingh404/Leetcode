class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];

        Arrays.sort(potions);
        
        for(int i=0 ; i<n ; i++){
            int left = 0; 
            int right = m-1;
            int index= -1;
            while(left < right){
                int mid = (left + right) / 2;

                if((long)spells[i] * potions[mid] >= success){
                    right = mid;
                }else{
                    left = mid+1;
                }
            }
            
            if((long)spells[i] * potions[left] >= success) index = left;
            if(index != -1) pairs[i] = m-index;
            else pairs[i] = 0;
        }
        return pairs;
    }
}
