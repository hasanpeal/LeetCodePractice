public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int area = 0;
        int maxArea = 0;
        int width = 0;
        while(start < end){
            width = end - start;

            
            area = width * Math.min(height[start], height[end]);
            maxArea = Math.max(area, maxArea);
            if(height[start] <= height[end]) start++;
            else end--;
        }
        
        return maxArea;
    }
}
