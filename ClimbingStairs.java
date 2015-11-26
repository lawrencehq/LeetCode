package com.hq.code;

/**
 * @author hq
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * This question can be described as: the number of ways to climb to stair n is equal to 
 * the number of ways to climb to stair n-2 plus the number of ways to climb to stair n-1
 * while is  F(n) = F(n-1) + F(n-2), which is the recursive formal of Fibonacci numbers.
 *
 */

public class ClimbingStairs {
	public int climbStairs(int n) {
		int a = 0;
		int b = 1;
		while (n >= 0) {
			a = a + b;
			b = a - b;
			n--;
		}
		return a;
    }

}
