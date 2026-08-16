/**
 * @param {number[]} nums
 * @return {number}
 */
var longestSubsequence = function(nums) {
    let res=nums.reduce((a,c)=>a^c,0);
    if(res!==0) return nums.length;
    let hasNonZero = nums.some(x => x !== 0);
    if (hasNonZero) return nums.length - 1;
    return 0;
};