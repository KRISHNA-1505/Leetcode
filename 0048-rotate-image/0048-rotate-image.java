class Solution {
    public void rotate(int[][] matrix) {
        int i,j,t=0;
        int n=matrix.length;
        for(i=0,j=n-1;i<j;i++,j--)
        {
int[] temp=matrix[i];
matrix[i]=matrix[j];
matrix[j]=temp;
        }
        for(i=0;i<matrix.length;i++)
        {
            for(j=i+1;j<matrix[i].length;j++)
            {
                t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
    }
}