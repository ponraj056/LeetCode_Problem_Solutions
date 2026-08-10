/**
 * @param {string} s
 * @return {string}
 */
var finalString = function(s) {
    let arr=[];
    for(let i of s){
      if(i=="i"){
        arr.reverse();
        continue;
      }
      arr.push(i);
    }
    return arr.join("");
};