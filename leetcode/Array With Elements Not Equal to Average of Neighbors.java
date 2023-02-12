/*
    url : https://leetcode.com/contest/weekly-contest-254/problems/array-with-elements-not-equal-to-average-of-neighbors/
*/
class Solution {
    /*
    TC : O(N× Log N)
    SC : O(1)
    */
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1 ;i< nums.length;i+=2) {
            swap(nums,i,i-1);
        }
        return nums;
    }
    
    
    private void swap(int[]nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2] ;
        nums[idx2] = temp;
    }
}