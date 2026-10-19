class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i = 0, j = 0, k = 0;
        int[]merge=new int[m+n];
        while(i<m &&j<n){
            if(nums1[i]<nums2[j]){
                merge[k]=nums1[i];
                k++;
                i++;
            }
            else{
                merge[k]=nums2[j];
                k++;
                j++;
            }
        }
        if(i==m){
            while(j<n){
                merge[k]=nums2[j];
                j++;
                k++;
            }
        }else{
            while(i<m){
                merge[k]=nums1[i];
                i++;
                k++;
            }
        }
        for(k=0,i=0;k<merge.length;i++,k++){
            nums1[i]=merge[k];
        }
    }
}