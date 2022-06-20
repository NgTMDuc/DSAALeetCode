/*
 * Given an array of integers nums which is sorted in ascending order, 
 * and an integer target, write a function to search target in nums. 
 * If target exists, then return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 */

public class Solution {
	public int search(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;
		while (l <= r) {
			int m = (r+l)/2;
			if (nums[m] == target) {
				return m;
			}
			else if (nums[m] < target) {
				l = m +1;
			}
			else {
				r = m -1;
			}
		}
		return -1;
	}
	
	
	// Test algorithm
	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		int target = 2;
		Solution sol = new Solution();
		System.out.println(sol.search(nums, target));

	}
}
