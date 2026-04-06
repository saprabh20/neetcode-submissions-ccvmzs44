class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            int[] count = new int[26];
            char[] charArr = strs[i].toCharArray();
            for(int j = 0; j < charArr.length; j++) {
                count[charArr[j] - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(strs[i]);
        }
        return new ArrayList<>(res.values());
    }
}
