// Last updated: 2/13/2026, 11:24:00 AM
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ll=new ArrayList<>();
        int row=arr.length;
        int col=arr[0].length;
        int top=0;
        int bottom=row-1;
        int left=0;
        int right=col-1;
        int total=row*col;
        int cnt=0;
        while(cnt<total){
        for(int j=left;j<=right && cnt<total;j++){
            ll.add(arr[top][j]);
            cnt++;
        }
        top++;
           for(int i=top;i<=bottom && cnt<total;i++){
            ll.add(arr[i][right]);
            cnt++;
        }
        right--;
           for(int j=right;j>=left && cnt<total;j--){
            ll.add(arr[bottom][j]);
            cnt++;
        }
        bottom--;
           for(int i=bottom;i>=top && cnt<total;i--){
            ll.add(arr[i][left]);
            cnt++;
        }
        left++;
    }return ll;
    }
    
}