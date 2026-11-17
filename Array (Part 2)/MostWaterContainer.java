class Solution {
    public int maxArena(int[] height) {
        int maxarea=0;
        for(int i=0; i<height.length;i++){
            int j= height.length-1;
            int area;
            while(i<j){
                int width= j-i;
                int length=Math.min(height[i], height[j]);
                area=length*width;
                if(area>maxarea){
                    maxarea=area;
                }
                j--;
            }
        }
        return maxarea;
        
    }
    public int maxArea(int[] height) {
        int left =0;
        int right=height.length-1;
        int maxarea=0;
        while(left<right){
            int width=right-left;
            int length=Math.min(height[left], height[right]);
            int area=width*length;
            if (height[left]<height[right]){
                left++;
            }else{
                right--;
            }
            if(area>maxarea){
                maxarea=area;
            }
        }
        return maxarea;
    }
}