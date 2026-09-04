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
        ArrayList<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int number = entry.getKey();
            int freq = entry.getValue();
            buckets.get(freq).add(number);
        }
        int j = nums.length;
        int count = 0;
        int[] ans = new int[k];
        while (j >= 0 && count < k) {
            if (buckets.get(j).size() != 0) {
                for(int x = buckets.get(j).size() -1; x >= 0 && count < k; x--) {
                    ans[count] = buckets.get(j).get(x);
                    count++;
                }
            }
            j--;
        }
        return ans;
    }
}
