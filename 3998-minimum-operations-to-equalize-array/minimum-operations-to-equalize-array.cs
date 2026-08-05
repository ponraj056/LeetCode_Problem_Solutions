public class Solution {
    public int MinOperations(int[] nums) {
        int c=0;
        for(int i=1;i<nums.Length;i++){
            if(nums[i]!=nums[i-1]){
                c++;
                break;
            }
        }
        return c;
    }
}