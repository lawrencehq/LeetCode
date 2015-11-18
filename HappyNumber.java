/**
 * @author hq
 * Write an algorithm to determine if a number is "happy".
 */

public class HappyNumber {
    public boolean isHappy(int n) {
    	int sum = 0;
        while (n > 0) {
        	sum += Math.pow(n%10, 2);
        	n = n /10;
        }
        if (sum == 1) {
        	return true;
        } else if (n <= 0 && sum < 10) {
        	return false;
        }
        return isHappy(sum);
    }
}
