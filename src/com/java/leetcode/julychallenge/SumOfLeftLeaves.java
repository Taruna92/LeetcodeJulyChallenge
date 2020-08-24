package com.java.leetcode.julychallenge;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfLeftLeaves {
	
	 public int sumOfLeftLeaves(TreeNode root) {
			if(root==null) {
				return 0;
			}
			Queue<TreeNode>queue=new LinkedList<>();
			queue.add(root);
			int sum=0;
			while(!queue.isEmpty()) {
				TreeNode n1=queue.poll();
				
				if(n1.left==null && n1.right==null) {
					if(n1==root) {
						return 0;
					}
					sum=sum+n1.val;
				}
				if(n1.left!=null) {
					queue.add(n1.left);
				}
				if(n1.right!=null && (n1.right.left!=null || n1.right.right!=null)) {
					queue.add(n1.right);
				}		
			}
			return sum;		     
	    }

}
