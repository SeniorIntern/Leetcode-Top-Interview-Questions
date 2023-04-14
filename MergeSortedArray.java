// https://leetcode.com/problems/merge-sorted-array/

public class MergeSortedArray {
  // time: O(nlog(n)), space: O(1)
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int o = n;
    for (int i = m; i < nums1.length; i++) {
      nums1[i] = nums2[n - o];
      o--;
    }
    Arrays.sort(nums1);
    System.out.println(Arrays.toString(nums1));
  }

}
