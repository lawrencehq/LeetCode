/**
 * @author hq
 * Implement atoi to convert a string to an integer.
 */
public class MyAtoi {
	public int myAtoi(String str) {	
		if (str == null || str.equals("")) {
			return 0;
		}
		
		str = str.trim();
		int length = str.length();
		long result = 0;
		int a = 1;
		
		if (str.charAt(0) == '+') {
			a = 1;
		} else if (str.charAt(0) == '-') {
			a = -1;
		} else if (str.charAt(0) >= '0' && str.charAt(0) <= '9'){
			a = 1;
			result = str.charAt(0)-'0';
		} else {
			return 0;
		}
		
		for (int i = 1; i < length; i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				return (int) result;
			}
			result = result*10 + a*(str.charAt(i)-'0');
			if (result > Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			} else if (result < Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
		}
		
		return (int)result;
    }
}
