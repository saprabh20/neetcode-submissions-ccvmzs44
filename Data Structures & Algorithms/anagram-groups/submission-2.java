class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                count[c - 'a'] += 1;
            }
            String key = Arrays.toString(count);
            if(hm.containsKey(key)) {
                List<String> val = hm.get(key);
                val.add(s);
                hm.put(key, val);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                hm.put(key, list);
            }
        }
        // System.out.println(hm.values());
        List<List<String>> res = new ArrayList<>();
        hm.forEach((k, v) -> { res.add(v); });
        return res;
    }
}
