class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxA = 0;
        int i = 0;
        int j = n-1;
        while(i<j) {
            int area = Math.min(heights[i], heights[j]) * (j-i);
            maxA = Math.max(maxA, area);
            if(heights[i]<heights[j]) {
                i++;
            } else{
                j--;
            }
        }
        return maxA;
    }
}
