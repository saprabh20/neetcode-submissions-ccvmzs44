class TimeMap {
    // timestamp aur value ko ek saath rakhne ke liye chhota pair class
    private static class Entry {
        int timestamp;
        String value;
        Entry(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    private HashMap<String, List<Entry>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new Entry(timestamp, value));
    }

    public String get(String key, int timestamp) {
        List<Entry> list = map.get(key);
        if (list == null)
            return "";

        int l = 0, r = list.size() - 1;
        String result = ""; // koi valid timestamp na mile to "" hi return hoga

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (list.get(mid).timestamp <= timestamp) {
                result = list.get(mid).value; // valid candidate, save karo
                l = mid + 1; // aur bada valid timestamp dhoondo
            } else {
                r = mid - 1; // yeh bahut aage hai, left mein dekho
            }
        }
        return result;
    }
}