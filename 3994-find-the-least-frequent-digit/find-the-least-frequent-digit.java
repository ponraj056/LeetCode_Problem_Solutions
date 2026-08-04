class Solution {
    public int getLeastFrequentDigit(int n) {
        int min=Integer.MAX_VALUE;
        Map<Integer,Integer> map=new HashMap<>();
        while(n!=0){
            int digit=n%10;
            map.put(digit,map.getOrDefault(digit,0)+1);
            n/=10;
        }
        int minfreq=Integer.MAX_VALUE;
        for(int j:map.values()){
            minfreq=Math.min(minfreq,j);
        }
        for(int i:map.keySet()){
            if(map.get(i)==minfreq){
                min=Math.min(min,i);
            }
        }
        return min;
    }
}