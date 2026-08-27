class Solution {
    public int maxDifference(String s) {
        int freq[]=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int odd=0;
        int even=Integer.MAX_VALUE;
        for(int i=0;i<freq.length;i++){
            if(freq[i]%2==0 && freq[i]!=0){
                 even=Math.min(even,freq[i]);
            }
            else if(freq[i]%2!=0){
                odd=Math.max(odd,freq[i]);
            }
        }
        return odd-even;
    }
}