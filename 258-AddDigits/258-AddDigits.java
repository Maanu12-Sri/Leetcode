// Last updated: 2/13/2026, 11:23:44 AM
class Solution {
    public int addDigits(int num) {
        while(num > 9){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
      num=sum;
        }
        return (num);
    }
}