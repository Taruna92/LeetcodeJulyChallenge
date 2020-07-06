package com.java.leetcode.julychallenge;

/**
 * Forms a staircase shape, where every k-th row must have exactly k coins.
 *
 */
public class ArrangeCoins {

	public static void main(String[] args) {
		arrangeCoins(9);
	}

	/**
	 * Returns total number of full staircase rows that can be formed.
	 * 
	 * @param n
	 * @return
	 */
	public static int arrangeCoins(int n) {
		if (n == 1) {
			return 1;
		}
		long num2 = 2 * (long) n;
		for (int i = 1; i <= (n); i++) {
			long num1 = (long) i * (i + 1);
			if (num1 == num2) {
				return i;
			} else if (num1 > num2) {
				return i - 1;
			}
		}
		return 0;
	}
}
