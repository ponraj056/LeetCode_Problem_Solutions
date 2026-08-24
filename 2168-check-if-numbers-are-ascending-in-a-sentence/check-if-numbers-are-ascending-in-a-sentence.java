class Solution {
    public boolean areNumbersAscending(String s) {
        String arr[]=s.split(" ");
        List<Integer> list=new ArrayList<>();
        for(String a:arr){
            if(a.matches("\\d+")){
                int n=Integer.parseInt(a);
                list.add(n);
            }
        }
        for(int i=1;i<list.size();i++){
            if(list.get(i-1)>=list.get(i)) return false;
        }
        return true;
    }
}