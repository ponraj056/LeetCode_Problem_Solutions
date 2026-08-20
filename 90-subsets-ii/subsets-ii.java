class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
     Set<List<Integer>> ans=new HashSet<>();
     List<List<Integer>> list1=new ArrayList<>();
     sub(nums,0,new ArrayList<>(),ans);
     list1.addAll(ans);
     return list1;
    }
    public static void sub(int[] nums,int index,List<Integer> list,Set<List<Integer>> ans){
        if(index==nums.length){
              ans.add(new ArrayList<>(list));
            return;
        }
        sub(nums,index+1,list,ans);
        list.add(nums[index]);
        sub(nums,index+1,list,ans);
        list.remove(list.size()-1);
    }
}