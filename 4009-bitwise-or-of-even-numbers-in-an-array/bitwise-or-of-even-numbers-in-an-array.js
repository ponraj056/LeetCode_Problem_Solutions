/**
 * @param {number[]} nums
 * @return {number}
 */
var evenNumberBitwiseORs = function(nums) {
  let re= nums.reduce((acc, curr) => curr % 2 === 0 ? acc | curr : acc, 0);
  return re;
};