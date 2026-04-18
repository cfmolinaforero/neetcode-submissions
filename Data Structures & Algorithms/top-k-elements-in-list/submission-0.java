public class Solution {
    static public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Build hashmap - with Num(key) and Frequency(value)
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i <= nums.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int count = 0;

        for (int i = buckets.length - 1; i > 0 || count < k; i--) {
            if (buckets[i] != null) {
                while (!buckets[i].isEmpty() && count < k) {
                    res[count] = buckets[i].remove(0);
                    count++;
                }
            }
        }

        return res;
    }

}
