class Solution {
    public int majority(int[] nums) {
        int majority=-1;
        for(int i =0;i<nums.length;i++){
            int count=0;
            for(int j =0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(nums.length/2 < count){
                majority= nums[i];
                break;
            }
        }
        return majority;
    }
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}