class Solution {
    public int dominantIndex(int[] nums) {
        int max=nums[0];
        int ind=0;
        for(int i=1;i<nums.length;i++){
             if(max<nums[i]){
                max=nums[i];
                ind=i;
             }
        }
        for(int i=0;i<nums.length;i++){
        if(ind!=i && 2*nums[i]>nums[ind]){
              return -1;
        }
        }
        return ind;
    }
}