class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
      Map<Integer,Integer> map=new HashMap<>();
      int sum=0;
      for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
      }
      for(int j:map.keySet()){
        if(map.get(j)%k==0){
            sum+=j*map.get(j);
        }
      }
      return sum;
    }
}