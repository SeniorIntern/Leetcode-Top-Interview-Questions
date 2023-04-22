// https://leetcode.com/problems/contains-duplicate/
class Solution {
  // space complexity: O(n), time complexity: O(n^2)
  public boolean containsDuplicate(int[] nums) {
    List<Integer> list = new ArrayList<Integer>(nums.length);
    for (int i = 0; i < nums.length; i++) {
      if (list.contains(nums[i]))
        return true;
      list.add(nums[i]);
    }
    return false;
  }
}