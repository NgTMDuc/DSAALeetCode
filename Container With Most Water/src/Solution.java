
public class Solution {	
	public int maxArea(int[] height) {
		reutn 0;
	}
	
	public int computeArea(int[] height, int start, int end) {
		return (end - start) * Math.min(height[start], height[end]);
	}
}
