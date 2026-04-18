class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> subset = new ArrayList<Integer>();
        dfs(nums, 0, subset, res);
        return res;
    }

    private void dfs(int[] nums, int i, List<Integer> subset, List<List<Integer>> res) {
        // base case
        if (i >= nums.length) {
            res.add(new ArrayList<Integer>(subset));
            return;
        }
        
        subset.add(nums[i]);

        dfs(nums, i + 1, subset, res);

        subset.remove(subset.size() - 1);
        dfs(nums, i + 1, subset, res);
    }
}
