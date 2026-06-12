class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int result = -1;

        while(i<j){

            int distance = j - i;
            int height = Math.min(heights[i], heights[j]);
            int area = distance * height;

            if(heights[j] < heights[i]){
                j--;
            }

            else{
                i++;
            }
            result = Math.max(area, result);
        }
        return result;
    }
}
