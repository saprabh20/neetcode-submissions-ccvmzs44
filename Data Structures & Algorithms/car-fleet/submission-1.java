public class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<List<Integer>> list = new ArrayList<>();
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < speed.length; i++) {
            List<Integer> pair = new ArrayList<>();
            pair.add(position[i]);
            pair.add(speed[i]);
            list.add(pair);
        }
        list.sort((a, b) -> b.get(0) - a.get(0));
        for (List<Integer> fl : list) {
            int pos = fl.get(0);
            int spd = fl.get(1);
            double t = (double) (target - pos) / spd;
            if (!stack.empty()) {
                if (t > stack.peek()) {
                    stack.push(t);
                }
            } else {
                stack.push(t);
            }
        }

        return stack.size();
    }
}