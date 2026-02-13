// Last updated: 2/13/2026, 11:23:47 AM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
  
     int n=nums.length;
       return(nums[n-k]);
    }
}