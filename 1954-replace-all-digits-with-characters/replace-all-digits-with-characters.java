class Solution {
    public String replaceDigits(String s) {
       
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%2!=0){
              char pre=s.charAt(i-1);
              int n=s.charAt(i)-'0';
              char val=(char)(pre+n);
              sb.append(val);
            }
            if(i%2==0){
                sb.append(s.charAt(i));  
            }
        }
        return sb.toString();
    }
}