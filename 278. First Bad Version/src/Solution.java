/*You are a product manager and currently leading a team to develop a new product. 
 * Unfortunately, the latest version of your product fails the quality check. 
 * Since each version is developed based on the previous version, 
 * all the versions after a bad version are also bad.
 * Suppose you have n versions [1, 2, ..., n] 
 * and you want to find out the first bad one, which causes all the following ones to be bad.
 * You are given an API bool isBadVersion(version) which returns whether version is bad. 
 * Implement a function to find the first bad version. 
 * You should minimize the number of calls to the API.
 */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution {
	// Time LIMIT Exceeded
  	 public int firstBadVersion(int n) {
	        int l = 1 ;
	        int r = n ;
	        int med = l + (r - l)/2;
	        while (l <= r){
	            if (isBadVersion(med) && !isBadVersion(med-1)){
	                return med;
	            }
	            else if (isBadVersion(med)){
	                r = med-1;
	            }
	            else {
	                l = med +1;
	            }
	            med =l + (r- l)/2;
	        }
	        return -1;
	    }
}
