/**
 * @param {number[]} nums
 * @return {number[]}
 */
var decompressRLElist = function(nums) {
    arr=[];
    let i=0;
    while(i<nums.length-1){
       let j=1;
       while(j<=nums[i]){
         arr.push(nums[i+1])
          j++;
       }
       i+=2;     
    }
    return arr;
};