/**
 * @param {number} n
 * @return {boolean}
 */
var checkDivisibility = function (n) {
    if(n<1) return false;
    let i = n;
    let sum = 0;
    let product = 1;
    while (i > 0) {
        let d=i%10;
        i = Math.floor(i / 10);
        sum += d;
        product *= d;
    }
    return n % (sum + product) == 0
  
};