import java.util.HashSet;
import java.util.Scanner;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		int i =0, j=0;
		int max = 0;
		HashSet<Character> hash_set = new HashSet<Character>();
		while (j < s.length()) {
			if (!hash_set.contains(s.charAt(j))){
				hash_set.add(s.charAt(j));
				j++;
				max = Math.max(hash_set.size(), max);
			}
			else {
				hash_set.remove(s.charAt(i));
				i++;
			}
		}
		
		return max; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a string to test");
		String s = sc.nextLine();
		Solution sol = new Solution();
		System.out.println(sol.lengthOfLongestSubstring(s));
	}
}
