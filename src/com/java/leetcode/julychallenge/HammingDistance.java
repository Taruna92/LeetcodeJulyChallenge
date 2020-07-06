package com.java.leetcode.julychallenge;

/**
 * The Hamming distance between two integers is the number of positions at which
 * the corresponding bits are different.
 *
 */
public class HammingDistance {

	public static void main(String[] args) {
		hammingDistance(1, 4);
	}

	/**
	 * Returns the number positions where the corresponding bits for x and y are
	 * different.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static int hammingDistance(int x, int y) {

		String xBinaryString = Integer.toBinaryString(x);
		String yBinaryString = Integer.toBinaryString(y);
		int len = Math.abs(xBinaryString.length() - yBinaryString.length());

		if (xBinaryString.length() > yBinaryString.length()) {
			while (len > 0) {
				yBinaryString = "0" + yBinaryString;
				len--;
			}
		} else {
			while (len > 0) {
				xBinaryString = "0" + xBinaryString;
				len--;
			}
		}
		String[] xBinaryArray = xBinaryString.split("");
		String[] yBinaryArray = yBinaryString.split("");
		int count = 0;
		for (int i = 0; i < xBinaryArray.length; i++) {
			if ((Integer.parseInt(xBinaryArray[i]) - Integer.parseInt(yBinaryArray[i]) != 0)) {
				count++;
			}
		}
		return count;
	}
}
