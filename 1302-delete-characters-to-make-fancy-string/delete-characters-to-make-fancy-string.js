/**
 * @param {string} s
 * @return {string}
 */
var makeFancyString = function(s) {
    let res="";
    for(let i=0;i<s.length-1;i++){
        if(s[i]===s[i+1] && s[i+1] === s[i+2]){
          continue;
        }
        else{
            res+=s[i];
        }
    }
    return res+s[s.length-1];
};