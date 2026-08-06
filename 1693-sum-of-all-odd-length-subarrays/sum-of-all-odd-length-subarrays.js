/**
 * @param {number[]} arr
 * @return {number}
 */
var sumOddLengthSubarrays = function(arr) {
    let sum=0;
    let n=arr.length;
    for(let i=0;i<n;i++){
        let t=(i+1)*(n-i);
        let odd=Math.floor((t+1)/2);
        sum+=arr[i]*odd;
    }
    return sum;
};