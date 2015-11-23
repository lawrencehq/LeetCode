/**
 * @author hq
 * A peak element is an element that is greater than its neighbors.
 * Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
 */
public class FindPeakNumber {
	public int findPeakNumber(int[] nums) {
		if (nums.length == 0) {
			return -1;
		}
		if (nums.length == 1) {
			return 0;
		}
		int mid = 0;
		int low = 0;
		int high = nums.length -1;
		
		while (low <= high) {
			mid = low + (high - low)/2;
			if (mid == 0 && nums[mid] > nums[mid+1]) {
				return mid;
			} else if (mid == nums.length - 1 && nums[mid] > nums[mid-1]) {
				return mid;
			} else if (nums[mid] > nums[mid+1] && nums[mid]>nums[mid-1]){
				return mid;
			} else if (nums[mid] < nums[mid+1]) {
				low = mid + 1;
			} else if (nums[mid] < nums[mid-1]) {
				high = mid - 1;
			}
		}
		
		return -1;
		
	}
}
