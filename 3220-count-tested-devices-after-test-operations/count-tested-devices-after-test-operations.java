class Solution {
    public int countTestedDevices(int[] b) {
        int max=0;
        for(int i:b) if(i-max>0) max++;
        return max;
    }
}