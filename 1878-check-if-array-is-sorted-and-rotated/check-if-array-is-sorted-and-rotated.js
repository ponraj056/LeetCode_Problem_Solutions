/**
 * @param {number[]} nums
 * @return {boolean}
 */
var check = function(nums) {
    let r=nums.reduce((a,c,i,nums) => c > nums[(i+1)%nums.length] ? a+1 : a ,0);
    return r<=1;
};