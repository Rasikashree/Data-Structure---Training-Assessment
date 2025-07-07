class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE, left=0, right=height.length-1;
        while(left<right){
            int width=Math.min(height[left],height[right]);
            int length=right-left;
            max=Math.max(max,width*length);
            if(height[left]<=height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
