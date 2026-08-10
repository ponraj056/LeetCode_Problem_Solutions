/**
 * @param {number} num
 * @return {boolean}
 */
var completePrime = function (num) {
    if (!prime(num)) return false;
    let k = num.toString();
    for (let i = 0; i <= k.length; i++) {
        let a = k.substring(i, 0);
        let p = parseInt(a);
        if (!prime(p)) {
            return false;
        }
    }
    for (let i = 1; i < k.length; i++) {
        let a = k.substring(i);
        let p = parseInt(a);
        if (!prime(p)) {
            return false;
        }
    }
    return true;
};
var prime = function (n) {
    if (n < 2) {
        return false;
    }
    for (let i = 2; i <= Math.floor(Math.sqrt(n)); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}