class Solution {
    public long sumAndMultiply(int n) {
       if(n<2){
        return n;
       }
        String s=String.valueOf(n);
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c!='0'){
                sb.append(c);
            }
        }
        String s1=sb.toString();
        long x=Integer.parseInt(s1);
        long p=x;
        long sum=0;
        while(p!=0){
            long digit=p%10;
            sum+=digit;
            p/=10;
        }
        Long max=sum*x;
        return max;
    }
}