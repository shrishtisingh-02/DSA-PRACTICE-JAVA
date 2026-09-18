package TwoDimensionArray;

public class ScanAfterFlipping {
    public int matrixScore(int[][]arr){
      int m=arr.length;// row
      int n=arr[0].length;  // col

        for(int i=0;i<m;i++){
            if(arr[i][0]==0){
                for(int j=0;j<n;j++){
                   arr[i][j]^=1;
                }
            }
        }
        for(int j=0;j<n;j++){
int zeroes=0,ones=0;
            for(int i=0;i<m;i++){
if(arr[i][j]==0) zeroes++;
else ones++;
            }
            if(zeroes>ones){
                for(int i=0;i<m;i++){
                    arr[i][j]^=1;
                }
            }
        }
        int sum=0;
        int pow=1;
        for(int j=n-1;j>=0;j--){
            int ones=0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==1) ones++;
            }
            sum+=ones*pow;
            pow*=2;
        }
        return sum;
    }
}
