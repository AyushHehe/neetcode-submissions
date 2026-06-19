class Solution {
    public int trap(int[] height) {
        
        int sum = 0;

        for(int i=0; i<height.length; i++){

            int maxleft = height[i];
            int maxright = height[i];

            for(int k=0; k<i; k++){
                maxleft = Math.max(height[k], maxleft);
            }

            for(int j=i+1; j<height.length; j++){
                maxright = Math.max(height[j], maxright);
            }

            sum += Math.min(maxright, maxleft) - height[i];
        }
        return sum;
    }
}
