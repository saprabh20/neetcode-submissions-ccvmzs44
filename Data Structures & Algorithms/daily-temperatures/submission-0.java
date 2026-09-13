class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            int days = 0;
            for(int j = i+1; j < n; j++) {
                if(temperatures[j] > temperatures[i]) {
                    days = j - i;
                    break;
                }
            }
            result[i] = days;   
        }
        return result;
    }
}
