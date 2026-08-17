/**
 * @param {string} s
 * @return {string}
 */
var sortSentence = function(s) {
    let arr=new Array();
    let s1=s.split(" ");
    for(let s2 of s1){
        let ind=Number(s2[s2.length-1]);
        s2=s2.replace(s2[s2.length-1],"");
        arr[ind]=s2;
    }
    return arr.filter(Boolean).join(" ");
};