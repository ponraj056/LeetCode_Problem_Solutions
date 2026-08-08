class Solution {
    public int smallestIndex(int[] nums) {
        for(int j=0;j<nums.length;j++){
            int n=nums[j];
            int sum=0;
            while(n!=0){
                sum+=n%10;
                n/=10;
            }
            if(j==sum){
                return j;
            }
        }
        return -1;
    }
}