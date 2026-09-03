class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int n : nums) {
            if (hm.containsKey(n)) {
                int val = hm.get(n);
                hm.put(n, ++val);
            } else {
                hm.put(n, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(hm.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());
        int[] ans = new int[k];
        for(int i = 0; i < k; i++) {
            ans[i] = entryList.get(i).getKey();
        }
        return ans;
    }
}
