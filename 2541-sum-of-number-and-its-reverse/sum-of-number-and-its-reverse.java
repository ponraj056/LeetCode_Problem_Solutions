class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0) return true;
        String s = String.valueOf(num);
        for (int i = 0; i < num; i++) {
            String t = new StringBuilder(String.valueOf(i)).reverse().toString();
            int k = i + Integer.parseInt(t);
            if(k==num){
                return true;
            }
        }
        return false;
    }
}