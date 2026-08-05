class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        int c=1;
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                if(c<k){
                    list.add(nums[i]);
                }
                c++;
            }
            else{
                list.add(nums[i]);
                c=1;
            }
        }
        System.out.println
        (list);
        int arr[]=new int[list.size()];
        int ind=0;
        for(int i:list){
            arr[ind]=i;
            ind++;
        }
   return arr;
 
    }
}