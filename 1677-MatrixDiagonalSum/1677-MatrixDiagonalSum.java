// Last updated: 2/13/2026, 11:23:22 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int m=mat.length;
        int sum=0;
        int ssum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    sum+=mat[i][j];
                    if(i+j==n-1 && i!=j){
                        ssum+=mat[i][j];                    
                }
            }
        }
        return(sum+ssum);
    }
}