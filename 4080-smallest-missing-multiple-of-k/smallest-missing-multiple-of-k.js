/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var missingMultiple = function(nums, k) {
    let max=nums.reduce((a,c)=> a<c?c:a);
    let arr=new Array();
    if(max<k) return k;
    for(let i=1;i<=max;i++){
        if(i%k==0){
            arr.push(i);
        }
    }
    for(let i=0;i<arr.length;i++){
        if(!nums.includes(arr[i])){
           return arr[i];
        }
    }
    return arr[arr.length-1]+k;
};