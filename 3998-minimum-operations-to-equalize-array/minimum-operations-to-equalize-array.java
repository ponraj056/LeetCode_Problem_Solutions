class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int i:nums){
        if(nums[0]==i){
          c++;
        }
        } 
        return c<nums.length ? 1:0;
    }
}