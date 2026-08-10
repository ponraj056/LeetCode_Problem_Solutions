/**
 * @param {number[][]} tasks
 * @return {number}
 */
var earliestTime = function(tasks) {
    let min=Number.MAX_VALUE;
    for(let i=0;i<tasks.length;i++){
        let sum=0;
        for(let j=0;j<tasks[0].length;j++){
            sum+=tasks[i][j];
        }
        min=Math.min(min,sum);
    }
    return min;
};