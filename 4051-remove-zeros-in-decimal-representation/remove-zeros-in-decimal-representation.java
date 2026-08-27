class Solution {
    public long removeZeros(long n) {
        String s=String.valueOf(n);
        for(char c:s.toCharArray()){
            if(c=='0'){
                s=s.replace(String.valueOf(c),"");
            }
        }
        return Long.parseLong(s);
    }
}