class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0;
        int j = row*col-1;
        while(i <= j) {
            int mid = i + (j - i)/ 2;
            if(target < matrix[mid/col][mid%col]) {
                j = mid - 1;
            } else if(target > matrix[mid/col][mid%col]) {
                i = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
