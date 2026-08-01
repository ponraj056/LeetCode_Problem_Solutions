public class Solution {
    public bool IsPowerOfFour(int n) {
        for(int i=0;i<32;i++){
            if(n>0 && (n&(n-1))==0 && (n&0x55555555)!=0) return true;
        }
        return false;
    }
}