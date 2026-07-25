public class Solution {
    public int MaxProduct(int n) {
        int l=n;
        int max=0;
        int sec=0;
        while(l!=0){
            int digit=l%10;
            if(digit>max){
                sec=max;
                max=digit;
            }
            else if(digit>sec && sec!=max){
                sec=digit;
            }
            l/=10;
        }
       Console.WriteLine(sec);
   
        return max*sec;
    }
}