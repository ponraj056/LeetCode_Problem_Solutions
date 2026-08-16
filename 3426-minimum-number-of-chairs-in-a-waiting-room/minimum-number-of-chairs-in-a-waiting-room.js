/**
 * @param {string} s
 * @return {number}
 */
var minimumChairs = function(s) {
    let c=0;
    let per=0;
    for(let i=0;i<s.length;i++){
        if(s[i]=='E'){
            per++;
            if(per>=c){
                c=per;
            }
        }
        else per--;
    }
    return c;
};