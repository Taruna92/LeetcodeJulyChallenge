package com.java.leetcode.julychallenge;

/**
 * Determines the perimeter of the island.
 *
 */
public class IslandPerimeter {

	public static void main(String[] args) {
		int[][] grid = new int[][] { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		System.out.println("islandPerimeter is :" + islandPerimeter(grid));

	}

	public static int islandPerimeter(int[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {

					// Check left cell
					if (j == 0) {
						count++;
					} else {
						if (grid[i][j - 1] == 0) {
							count++;
						}
					}
					// Check right cell
					if (j == grid[0].length - 1) {
						count++;
					} else {
						if (grid[i][j + 1] == 0) {
							count++;
						}
					}
					// Check top cell
					if (i == 0) {
						count++;
					} else {
						if (grid[i - 1][j] == 0) {
							count++;
						}
					}
					// Check down cell
					if (i == grid.length - 1) {
						count++;
					} else {
						if (grid[i + 1][j] == 0) {
							count++;
						}
					}
				}
			}
		}
		return count;
	}
}
