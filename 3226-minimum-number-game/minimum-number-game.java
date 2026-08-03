class Solution {
    public int[] numberGame(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i+=2){
           int temp=arr[i];
           arr[i]=arr[i+1];
           arr[i+1]=temp;
        }
        return arr;
    }
}