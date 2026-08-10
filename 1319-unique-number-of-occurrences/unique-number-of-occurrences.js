/**
 * @param {number[]} arr
 * @return {boolean}
 */
var uniqueOccurrences = function (arr) {
    let freq = new Map();
    for (let i of arr) {
        freq.set(i, (freq.get(i) || 0) + 1);
    }
    const res = [...freq.values()];
    res.sort((a,b)=> a-b);
    for (let i = 0; i < res.length; i++) {
        if (res[i - 1]===res[i]) {
            return false;
        }
    }
    return true;
};