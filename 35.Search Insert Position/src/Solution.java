
public class Solution {
	public int searchInsert(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;
		int med = l + (r-l)/2;
		
		while (l <= r) {
			if (nums[med] == target) {
				return med;
			}
			else if (nums[med] < target){
				l = med + 1;
			}
			else {
				r = med - 1;
			}
			med = l + (r-l)/2;
		}
		return l;
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] lst = {1,3,5,6};
		int target = 2;
		System.out.println(sol.searchInsert(lst, target));
	}
}
