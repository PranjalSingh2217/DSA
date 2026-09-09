class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int last=height.length-1;
        int area=0;
        while(start<last){
            int currentArea=(last-start)*Math.min(height[last],height[start]);
            area=Math.max(area,currentArea);
            if(height[start]<height[last]){
                start++;
            }
            else{
                last--;
            }
        }
      return area;
        
    }
}