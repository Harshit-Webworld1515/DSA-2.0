class Solution {
    public int singleNumber(int[] nums) {
        int single=-1;
        for (int i=0;i<nums.length;i++){
            boolean isfound=false;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]==nums[j]){
                    isfound=true;
                    break;
                }
            }
            if(!isfound){
                single= nums[i];
                break;
            }
        }
        return single;
    }
}