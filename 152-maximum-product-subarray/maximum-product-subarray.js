/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProduct = function(nums) {
        let n=nums.length;
        if(n==0) return 0;
        let max=nums[0];
        let min=nums[0];
        let res=nums[0];
        for(let i=1;i<n;i++){
            let curr=nums[i];
            if(curr<0){
                let temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(curr,max*curr);
            min=Math.min(curr,min*curr);
            res=Math.max(res,max);
        }
        return res;
};