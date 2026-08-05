public class Solution {
    public int CountDigitOccurrences(int[] nums, int digit) {
     int count=0;
     foreach(int n in nums){
        int i=n;
        while(i!=0){
            int digit1=i%10;
            if(digit1==digit) count++;
            i=i/10;
        }
     }
     return count;
    }
}