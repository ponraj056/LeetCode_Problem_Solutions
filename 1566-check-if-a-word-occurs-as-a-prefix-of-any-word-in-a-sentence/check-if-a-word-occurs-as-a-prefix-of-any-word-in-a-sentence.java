class Solution {
    public int isPrefixOfWord(String sentence, String s1) {
        String arr[]=sentence.split(" ");
       for(int i=0;i<arr.length;i++){
        if(arr[i].startsWith(s1)){
             return i+1;
        }
       }
        return -1;
    }
}