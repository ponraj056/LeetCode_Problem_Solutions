/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var reversePrefix = function(s, k) {
    let arr="";
    for(let i=k-1;i>=0;i--){
       arr+=s[i];
    }
    for(let i=k;i<s.length;i++){
        arr+=s[i];
    }
    return arr;
};