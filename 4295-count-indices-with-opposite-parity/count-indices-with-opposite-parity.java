class Solution {
    public int[] countOppositeParity(int[] nums) {
        int arr[]=new int[nums.length];
        int odd=0;
        int even=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]%2==0){
                arr[i]=odd;
                even++;
            }
            else{
                arr[i]=even;
                odd++;
            }
        }
        return arr;
    }
}