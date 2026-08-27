class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0) l2.add(nums[i]);
            else l1.add(nums[i]);
        }
        int ans[]=new int[nums.length];
        Collections.sort(l1);
        Collections.sort(l2);
        Collections.reverse(l1);
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
           if(i%2==0){
             ans[i]=l2.get(j);
             j++;
           }
           else{
            ans[i]=l1.get(k);
            k++;
           }
        }
        return ans;
    }
}