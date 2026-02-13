// Last updated: 2/13/2026, 11:24:07 AM
class Solution {
    public String intToRoman(int n) {
        int []num= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] r={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        String ans="";
        for(int i=0;i<num.length;i++){
            while(n>=num[i]){
                ans+=r[i];
                n-=num[i];
            }
        }return ans;
    }
    
}