class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        int n = s.length();
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(map.containsKey(c) && !stack.empty() && stack.peek() == map.get(c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        if(stack.empty()) {
            return true;
        }
        return false;
    }
}
