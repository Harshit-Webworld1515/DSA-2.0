class Solution {
    public int[] findErrorNums(int[] nums) {
        int rept=-1;
        int missing=-1;
        outer:
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                     rept=nums[i];
                    break outer;
                }
            }
        }
       for(int i=0;i<nums.length;i++){
       boolean isfound =false;
        for(int j=0;j<nums.length;j++){
            if(i+1==nums[j]){
                isfound=true;
                break;
            }
        }
        if(!isfound){
         missing=i+1;
        break;
        }
       }
       int result[] = new int[2];
       result[0] = rept;
       result[1] = missing;
       return result;
    }
}