class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid=nums.length/2;
        int freq[]=new int[101];
        for(int i:nums) freq[i]++;
         return freq[nums[mid]]<2;
    }
}