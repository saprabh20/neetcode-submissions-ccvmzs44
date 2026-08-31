class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (hm.containsKey(key)) {
                List<String> val = hm.get(key);
                val.add(s);
                hm.put(key, val);
            } else {
                ArrayList<String> list = new ArrayList<>();
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
