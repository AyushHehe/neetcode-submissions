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
                result = Math.max(area, result);
                j--;
            }

            else{
                result = Math.max(area, result);
                i++;
            }
        }
        return result;
    }
}
