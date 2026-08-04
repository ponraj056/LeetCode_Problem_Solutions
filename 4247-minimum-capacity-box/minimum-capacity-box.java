class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        List<Integer> list=new ArrayList<>();
         for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize){
                list.add(capacity[i]);
            }
        }
        Collections.sort(list);
        int min=Integer.MAX_VALUE;
        if(!list.isEmpty()){
         min=list.get(0);
        }
        for(int i=0;i<capacity.length;i++){
            if(min==capacity[i]){
                return i;
            }
        }
        return -1;
    }
}