package com.hq.code;
/**
 * @author hq
 * Given a string, determine if it is a palindrome,
 * considering only alphanumeric characters and ignoring cases.
 *
 */

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		if (s == null || s.isEmpty()) {
			return true;
		}
		int i = 0, j = s.length()-1;
		while (i < j) {
			if (!Character.isLetterOrDigit(s.charAt(i))) {
				i++;
			} else if (!Character.isLetterOrDigit(s.charAt(j))) {
				j--;
			} else {
				if (Character.toLowerCase(s.charAt(i)) 
						!= Character.toLowerCase(s.charAt(j))) {
					return false;
				}
				i++;
				j--;
			}
		}
		return true;
    }
}
