class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxEle = 0;
        for (int p : piles) {
            maxEle = Math.max(maxEle, p);
        }
        
        int l = 1;
        int r = maxEle;
        int answer = maxEle;  
        
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long hours = 0;
            for (int p : piles) {
                hours += (p + mid - 1) / mid; 
            }
            
            if (hours <= h) {
                answer = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return answer;
    }
}
