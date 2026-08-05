class Solution {
    public boolean validDigit(int n, int x) {
        String s=String.valueOf(n);
        if(s.length()==1) return false;
        String t=String.valueOf(x);
        return (s.contains(t))&&(s.charAt(0)!=t.charAt(0));
    }
}