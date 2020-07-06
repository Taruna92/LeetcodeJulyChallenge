package com.java.leetcode.julychallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes'
 * values. (ie, from left to right, level by level from leaf to root).
 *
 */
public class BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		if (root == null) {
			return list;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (queue.isEmpty() == false) {
			int nodeCount = queue.size();
			List<Integer> childNodeList = new ArrayList<>();

			while (nodeCount > 0) {
				TreeNode node = queue.poll();
				childNodeList.add(node.val);
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
				nodeCount--;
			}
			list.add(childNodeList);
		}
		Collections.reverse(list);
		return list;
	}

}
