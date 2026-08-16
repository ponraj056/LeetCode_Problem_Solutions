/**
 * @param {number[]} nums
 * @return {number}
 */
var minAbsoluteDifference = function(nums) {
    let min=[];
    for(let i=0;i<nums.length;i++){
        for(let j=0;j<nums.length;j++){
            if(nums[i]==1 && nums[j]==2){
                min.push(Math.abs(i-j));
            }
        }
    }
    min.sort((a,b)=>a-b);
    if(min.length===0) return -1;
    return min[0];
};