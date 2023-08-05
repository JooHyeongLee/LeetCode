package org.example.LeetCode75;

import org.example.data.TreeNode;
import java.util.LinkedList;
import java.util.Stack;

public class P104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> deptStack = new Stack<>();

        deptStack.push(1);
        stack.push(root);

        int max = 0;

        if (root == null) {
            return 0;
        }

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int dept = deptStack.pop();

            max = Math.max(dept, max);
            // 방문노드 stack에 저장
            if (node.getLeft() != null) {
                stack.push(node.getLeft());
                deptStack.push(dept + 1);
            }

            if (node.getRight() != null) {
                stack.push(node.getRight());
                deptStack.push(dept + 1);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode leftNode = new TreeNode(9);
        TreeNode rightNode = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        root.setLeft(leftNode);
        root.setRight(rightNode);
        P104 p = new P104();
        p.maxDepth(root);
    }
}
