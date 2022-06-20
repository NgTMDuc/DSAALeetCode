

public class Solution {
	public String longestPalindrome(String s) {
		if (s == null || s.length() < 1) {
			return "";
		}
		else {
			int start = 0;
			int end = 0;
			for (int i = 0; i < s.length(); i++) {
				int len1 = findSub(s, i, i);
				int len2 = findSub(s, i, i+1);
				int len = Math.max(len1, len2);
				if (len > end - start) {
					start = i - len/2;
					end = i + len/2;
				}
			}
			return s.substring(start, end+1);
		}
		
	}
	
	public int findSub(String s, int left, int right) {
		if (s == null || left > right) {
			return 0;
		}
		else {
			while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
				left --;
				right ++;
			}
		}
		return left - right +1;
	}
}
