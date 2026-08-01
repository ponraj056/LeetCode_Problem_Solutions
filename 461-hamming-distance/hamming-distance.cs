public class Solution {
    public int HammingDistance(int x, int y) {
        int p=x^y;
        int count=0;
        string s=Convert.ToString(p,2);
        foreach(char c in s){
            if(c=='1') count++;
        }
        return count;
    }
}