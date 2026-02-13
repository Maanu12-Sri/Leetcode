// Last updated: 2/13/2026, 11:24:10 AM
class Solution {
    public int[] twoSum(int[] nums, int t) {
        int n=nums.length;
           for(int i=0;i<n;i++){              
             for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==t){
            return new int[]{i,j};

         }
        } 
           }
    return new int[]{};

}
}