class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer>set = new HashSet<>();
        boolean visited =false;
        for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])){
            visited =true;
            return visited;
        }
         set.add(nums[i]);
        }
        return visited;
    }
}