class Solution {
    public int[] concatWithReverse(int[] nums) {
        int arr[]=new int[nums.length*2];
        int ind=0;
        for(int i:nums){
            arr[ind]=i;
            ind++;
        }
        for(int i=nums.length-1;i>=0;i--){
            arr[ind]=nums[i];
            ind++;
        }
        return arr;
    }
}