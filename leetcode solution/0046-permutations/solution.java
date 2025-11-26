class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        for (int x : nums) list.add(x);

        backtrack(result, new ArrayList<>(), list, nums.length);

        return result;
    }

     private void backtrack(List<List<Integer>> result, List<Integer> temp, List<Integer> list, int n) {

        if (temp.size() == n) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < list.size(); i++) {

            int val = list.get(i);

            list.remove(i);
            temp.add(val);

            backtrack(result, temp, list, n);

            temp.remove(temp.size() - 1);
            list.add(i, val);
        }
    }
}
