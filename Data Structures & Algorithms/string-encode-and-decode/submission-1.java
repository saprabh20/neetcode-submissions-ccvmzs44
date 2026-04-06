class Solution {

    public String encode(List<String> strs) {
        String s = "";
        for(int i = 0; i < strs.size(); i++) {
            s = s + strs.get(i) + "/";
        }
        return s;
    }

    public List<String> decode(String str) {
        ArrayList<String> list = new ArrayList<String>();
        String s = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != '/') {
                s = s + str.charAt(i);
            } else {
                list.add(s);
                s = "";
            }
        }
        return list;
    }
}
