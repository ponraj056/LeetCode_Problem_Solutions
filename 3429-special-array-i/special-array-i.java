class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1) return true;
        boolean valid=false;
        for(int i=1;i<nums.length;i++){
            if((nums[i-1]%2==0 && nums[i]%2!=0)||(nums[i-1]%2!=0 && nums[i]%2==0)){
               valid=true;
            }
            else{
                return false;
            }
        }
        if(valid){
            return true;
        }
        return false;
    }
}