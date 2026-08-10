/**
 * @param {number[]} nums
 * @return {boolean}
 */
var check = function(nums) {
     return (nums.reduce((a,c,i,nums) => c > nums[(i+1)%nums.length] ? a+1 : a ,0))<=1;
   
};