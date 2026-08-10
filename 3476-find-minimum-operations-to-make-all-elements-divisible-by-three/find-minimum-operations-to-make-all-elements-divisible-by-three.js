/**
 * @param {number[]} nums
 * @return {number}
 */
var minimumOperations = function(nums) {
    let r=nums.reduce((a,c) => c%3!==0 ? a+=1 : a,0);
    return r;
};