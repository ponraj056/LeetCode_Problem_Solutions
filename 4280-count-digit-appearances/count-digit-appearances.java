class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int i:nums){
            while(i!=0){
                int digit1=i%10;
                if(digit==digit1) count++;
                i/=10;
            }
        }
        return count;
    }
}