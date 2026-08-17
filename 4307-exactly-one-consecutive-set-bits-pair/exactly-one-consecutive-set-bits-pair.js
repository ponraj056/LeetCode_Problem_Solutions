/**
 * @param {number} n
 * @return {boolean}
 */
var consecutiveSetBits = function(n) {
    let s=n.toString(2);
    let c=0
    for(let i=1;i<s.length;i++){
        if(s[i-1]=='1' && s[i]=='1'){
            c++;
        }
    }
    return c===1;
};