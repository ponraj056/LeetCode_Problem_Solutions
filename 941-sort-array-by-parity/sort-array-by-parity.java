class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i:nums){
            if(i%2==0) l1.add(i);
            else l2.add(i);
        }
        Collections.sort(l1);
        Collections.sort(l2);
        Collections.reverse(l2);
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
           if(i<l1.size()){
           nums[i]=l1.get(j);
           j++;
           }
           else{
            nums[i]=l2.get(k);
            k++;
           }
        }
        return nums;
    }
}