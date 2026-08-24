class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int max[] = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                max[i] = Math.max(max[i], matrix[j][i]);
            }
        }
        int n=matrix[0].length-1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]== -1){
                 matrix[i][j]=max[j];
               }
            }
        }
        return matrix;
    }
}