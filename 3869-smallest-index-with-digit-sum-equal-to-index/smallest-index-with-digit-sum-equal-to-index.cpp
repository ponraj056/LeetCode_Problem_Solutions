class Solution {
public:
    int smallestIndex(vector<int>& arr) {
        for(int i=0;i<arr.size();i++){
            if(i==sum(arr[i])){
                return i;
            }
        }
        return -1;
    }
    int sum(int n){
        // while(n>10){
        int sum=0;
            while(n!=0){
                int digit=n%10;
                sum+=digit;  
                n/=10;    
            }
        //     n=sum;
        // }
        return sum;
    }
};