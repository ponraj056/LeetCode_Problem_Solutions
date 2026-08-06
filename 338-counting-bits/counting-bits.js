/**
 * @param {number} n
 * @return {number[]}
 */
var countBits = function(n) {
    const arr=[];
    for(let l=0;l<=n;l++){
       let count=0;
       let i=l;
       while(i!==0){
           i=i&(i-1);
           count++;
       }  
       arr.push(count);
    }
    return arr;
};