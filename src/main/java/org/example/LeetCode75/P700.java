package org.example.LeetCode75;

import org.example.data.TreeNode;

import java.util.Stack;

public class P700 {
    public TreeNode searchBST(TreeNode root, int val) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode result = new TreeNode();

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            if (node.getVal() == val) {
                result = node;
                break;
            } else {
                if (node.getLeft() != null) {
                    stack.push(node.getLeft());
                }

                if (node.getRight() != null) {
                    stack.push(node.getRight());
                }
            }
        }
        if (result.getVal() == 0) {
            return null;
        } else {
            return result;
        }
    }

    public static void main(String[] args) {
        P700 p = new P700();
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        p.searchBST(root, 5);
    }
}
