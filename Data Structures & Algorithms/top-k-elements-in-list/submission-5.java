class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int n : nums) hm.put(n, hm.getOrDefault(n, 0) + 1);

        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) buckets.add(new ArrayList<>());
        for (var entry : hm.entrySet()) buckets.get(entry.getValue()).add(entry.getKey());

        int[] ans = new int[k];
        int count = 0;
        for (int j = nums.length; j >= 0 && count < k; j--) {
            for (int num : buckets.get(j)) {
                if (count == k) break;
                ans[count++] = num;
            }
        }
        return ans;
    }
}