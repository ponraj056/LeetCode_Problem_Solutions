class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i :nums){
            if(i%2==0) l2.add(i);
            else l1.add(i);
        }
        int ind=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=l2.get(ind);
                ind++;
            }
            else{
                nums[i]=l1.get(j);
                j++;
            }
        }
        return nums;
    }
}