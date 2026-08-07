/**
 * @param {number[]} nums
 * @return {number}
 */
var countPartitions = function(nums) {
    let i=0;
    let c=0;
    let b=0;
    while(i!=nums.length-1){
        let sum=0;
        for(let j=i+1;j<nums.length;j++){
            sum+=nums[j];
        }
        b=nums[i]+b;
        let a=b-sum;
        if(a%2==0) c++;
        i++;
    }
    return c;
};
