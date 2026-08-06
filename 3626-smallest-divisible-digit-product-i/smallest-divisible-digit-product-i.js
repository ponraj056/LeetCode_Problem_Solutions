/**
 * @param {number} n
 * @param {number} t
 * @return {number}
 */
var digitcheck= function(i){
    let sum=1;
    while(i>0){
      sum*=i%10;
      i=Math.floor(i/10);
    }
    return sum;
};
var smallestNumber = function(n, t) {
   while(true){
    if(digitcheck(n)%t==0){
        return n;
    }
    n++;
   }
   return n;
};
 