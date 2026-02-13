// Last updated: 2/13/2026, 11:23:43 AM
class Solution {
    public int missingNumber(int[] nums) {
         Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<=nums.length;i++){
            map.put(i,1);
        }
        for(int i : nums){
            map.remove(i);
        }
        for(int i : map.keySet())
            return i;
            return -1;

    }
}