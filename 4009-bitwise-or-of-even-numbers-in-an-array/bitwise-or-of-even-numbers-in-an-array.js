/**
 * @param {number[]} nums
 * @return {number}
 */
var evenNumberBitwiseORs = function(nums) {
    let sum=0;
    for(const i of nums){
        if(i%2==0){
            sum |=i;
        }
    }
    return sum;
};