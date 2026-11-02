class Solution {
    public int countSquares(int[][] mat) {
        // code here
        int count = 0;
        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0; i <mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {

                if (i!=0&&j!=0) {
                    if(mat[i][j]==1){
                        mat[i][j] += Math.min(
                                mat[i - 1][j],
                                Math.min(mat[i - 1][j - 1], mat[i][j - 1])
                        );
                    }
                }

                count += mat[i][j];
            }
        }

        return count;
    }
}