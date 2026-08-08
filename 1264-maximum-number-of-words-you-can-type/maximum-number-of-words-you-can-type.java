class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] s=text.split("\\s+");
        int c=0;
        for(String s1:s){
            boolean valid=false;
            for(char ch:brokenLetters.toCharArray()){
            if(s1.contains(String.valueOf(ch))){
                valid=true;
            }
            }
            if(valid){
                c++;
            }
        }
        return s.length-c;
    }
}