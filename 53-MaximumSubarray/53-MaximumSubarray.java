// Last updated: 2/13/2026, 11:24:01 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
         int submax=0;
         for(int num:nums){
            submax+=num;
            max=Math.max(max,submax);
            if(submax<0) submax=0;
         }
         return max;
    }
}