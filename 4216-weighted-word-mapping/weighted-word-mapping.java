class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        Map<Character,Integer> map = new HashMap<>();
        Map<Integer,Character> map1 = new HashMap<>();
        int ind=0;
        for (char c='a'; c <='z'; c++) {
            map.put(c,weights[ind]);
            ind++;
        }
        int ind1=25;
        for (char c='a'; c <='z'; c++) {
            map1.put(ind1,c);
            ind1--;
        }
        String s = "";
        for(String q:words){
            int sum=0;
            for(char ch:q.toCharArray()){
             sum+=map.get(ch);
            }
            int res=sum%26;
            s+=map1.get(res);
        }
        return s;
    }
}