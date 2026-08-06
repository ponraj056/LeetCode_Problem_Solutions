/**
 * @param {number[]} arr
 * @return {number}
 */
var sumOddLengthSubarrays = function(arr) {
    let sum=0;
    let n=arr.length;
    for(let i=0;i<n;i++){
        sum+=arr[i]*Math.floor(((((i+1)*(n-i))+1)/2));
    }
    return sum;
};