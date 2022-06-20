
public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int i = 0, j = 0;
		int m = nums1.length;
		int n = nums2.length;
		int[] mergeList = new int[m+n];
		int k = 0;
		while (i < m & j < n) {
			if (nums1[i] < nums2[j]) {
				mergeList[k] = nums1[i];
				i++;
				k++;
			}
			else {
				mergeList[k] = nums2[j];
				j++;
				k++;
			}
		}
		if (i < m) {
			for (int tmp = i; tmp < m; tmp++) {
				mergeList[k] = nums1[tmp];
				k++;
			}
		}
		if (j < n) {
			for(int tmp = j; tmp < n; tmp++) {
				mergeList[k] = nums2[tmp];
				k++;
			}
		}
		
		if ((m+n)%2 == 0) {
			int med = (m+n)/2;
			return (mergeList[med-1] + mergeList[med])/(double)2;
		}
		else {
			int med = (m+n)/2;
			return mergeList[med];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
