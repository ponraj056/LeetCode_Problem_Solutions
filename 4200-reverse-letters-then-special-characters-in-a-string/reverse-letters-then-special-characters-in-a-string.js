/**
 * @param {string} s
 * @return {string}
 */
var reverseByType = function(s) {
    let arr=new Array();
    let ne=[];
    let arr1=[];
    for(let i=0;i<s.length;i++){
        if(s[i]>='a'&&s[i]<='z'){
            arr.push(s[i]);
        }
        else{
            arr1.push(i);
            ne.push(s[i]);
        }
    }
    let ind=0;
    let ind1=0;
    let res="";
    let x=0;
    arr.reverse();
    ne.reverse();
    for(let i=0;i<s.length;i++){
        if(arr1[ind]==i){
            res+=ne[ind1];
            ind++;
            ind1++;
        }
        else{
            res+=arr[x];
            x++;
        }
    }
    console.log(ne);
    console.log(arr1);
    return res;
};