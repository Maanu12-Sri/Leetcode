// Last updated: 2/13/2026, 11:23:27 AM
class Solution {

    public String defangIPaddr(String address) {
        return  address.replace(".","[.]");}
        public static void main(String[] args){
            Solution s=new Solution();
            System.out.print(s.defangIPaddr("1.1.1.1"));
        }
       
    }
