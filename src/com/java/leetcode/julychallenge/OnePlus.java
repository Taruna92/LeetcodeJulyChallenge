package com.java.leetcode.julychallenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus
 * one to the integer. The digits are stored such that the most significant
 * digit is at the head of the list, and each element in the array contain a
 * single digit.
 *
 */
public class OnePlus {
	public static void main(String[] args) {
		int[] cells = { 7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1,
				1, 1, 7, 4, 0, 0, 6 };
		Arrays.stream(plusOne(cells)).forEach(a -> System.out.print(a));
	}

	/**
	 * This method returns the array of digits after adding one to the integer. This
	 * can be achieved by BigInteger as well.
	 * 
	 * @param digits array of digits of integer.
	 * @return
	 */
	public static int[] plusOne(int[] digits) {
		List<Integer> list = new LinkedList<>();
		int carry = 0;
		for (int i = digits.length - 1; i >= 0; i--) {
			int num = digits[i] + carry;
			if (i == digits.length - 1) {
				num = num + 1;
			}
			if (num / 10 == 0) {
				carry = 0;
				list.add(num);
			} else {
				carry = 1;
				list.add(num % 10);
			}
		}
		if (carry == 1) {
			list.add(1);
		}
		Collections.reverse(list);
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
