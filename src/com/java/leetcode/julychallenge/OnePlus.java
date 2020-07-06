package com.java.leetcode.julychallenge;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class OnePlus {
	public static void main(String[] args) {
		//	int[]cells= {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
		int[]cells= {9};
		Arrays.stream(plusOne(cells)).forEach(a->System.out.print(a));
	}

	public static int[] plusOne(int[] digits) {
		List<Integer> list = new LinkedList<>();
		int carry = 0;
		for (int i = digits.length - 1; i >= 0; i--) { 
			System.out.println("i is :" + i + " carry is :" + carry);
			int num = digits[i] + carry;
			System.out.println("num1 is :" + num);
			if (i == digits.length - 1) {
				num = num + 1;
				System.out.println("num2 is :" + num);

			}
			System.out.println("before condition :" + (num / 10));
			if (num / 10 == 0) {
				System.out.println("if :" + num);

				carry = 0;
				list.add(num);
			} else {
				carry = 1;
				System.out.println("else :" + num + "num %10 is :" + (num % 10));
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
