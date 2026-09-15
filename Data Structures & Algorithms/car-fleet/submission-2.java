public class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] cars = new double[n][2]; // [position, time]
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }

        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0])); // position descending

        Stack<Double> stack = new Stack<>();
        for (double[] car : cars) {
            double t = car[1];
            if (stack.isEmpty() || t > stack.peek()) {
                stack.push(t);
            }
        }
        return stack.size();
    }
}