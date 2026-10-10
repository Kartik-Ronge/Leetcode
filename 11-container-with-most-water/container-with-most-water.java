class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length -1; 
        int max = 0;
        while (i < j){
            int dist = j - i;
            int h = Math.min(height[i],height[j]);
            int area = dist * h;

            max = Math.max(max,area);

            if (height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
    return max;
    }
}