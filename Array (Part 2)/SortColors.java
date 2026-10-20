class Solution {
    public void sortColors(int[] nums) {
        int a= 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int temp =nums[a];
                nums[a]=nums[i];
                nums[i]=temp;;
                a++;
            }
        }
        for(int i=0;i<nums.length;i++){
             if(nums[i]==1){
                int temp =nums[a];
                nums[a]=nums[i];
                nums[i]=temp;;
                a++;
            }
        }
    }
}