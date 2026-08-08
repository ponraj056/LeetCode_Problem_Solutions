/**
 * @param {number} n
 * @return {boolean}
 */
var checkGoodInteger = function(n) {
    let sum=0;
    let square=0;
    while(n!=0){
        digit=n%10;
        sum+=digit;
        square+=(digit*digit);
        n=Math.floor(n/10);
    }
    return (square-sum)>=50;
};