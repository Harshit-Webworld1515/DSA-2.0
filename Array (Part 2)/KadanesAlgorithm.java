//Maximum Subarray
class Solution {
 public int maxSubArray(int[] nums) {
        return kadane(nums);
    }


    public int maxSubArr(int[] nums) {
           int biggest = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
           int max=nums[i];
           int combine=nums[i];
           if(i==nums.length-1){
            max=nums[i];
           }else{
            for(int j=i+1;j<nums.length;j++){
                combine=combine+nums[j];
                if(combine>max){
                    max=combine;
                }
            }
           }
           if(biggest<max){
            biggest=max;
           }
        }
        return biggest;
    }
     public int kadane(int[] nums) {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i= 0; i<nums.length;i++){
            if(currsum<0){
                currsum=0;
            }
            currsum=currsum+nums[i];
            if(maxsum<currsum){
                maxsum=currsum;
            }
        }
        return maxsum;
     }
}