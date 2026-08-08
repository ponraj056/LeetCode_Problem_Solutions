public class Solution {
    public int[] LeftRightDifference(int[] nums) {
        int[] left=new int[nums.Length];
        int[] right=new int[nums.Length];
         int sum=0;
        for(int i=0;i<nums.Length;i++){
           left[i]=sum;
           sum+=nums[i];
        }
        int sum1=0;
        for(int i=nums.Length-1;i>=0;i--){
            right[i]=sum1;
            sum1+=nums[i];
        }
        int[] ans=new int[nums.Length];
        for(int i=0;i<nums.Length;i++){
            ans[i] = Math.Abs(left[i]-right[i]);
        }
        
    return ans;
    }
}