package com.java.leetcode.julychallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Returns the k most frequent elements.
 *
 */
public class TopKFrequentElements {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3 };
		topKFrequent(nums, 2);
	}

	public static int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] out = new int[k];

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault((nums[i]), 0) + 1);
		}
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				if (o1.getValue() == o2.getValue())
					return o2.getKey() - o1.getKey();
				else
					return o2.getValue() - o1.getValue();
			}
		});

		for (int j = 0; j < k; j++) {
			out[j] = list.get(j).getKey();
		}
		return out;
	}
}
