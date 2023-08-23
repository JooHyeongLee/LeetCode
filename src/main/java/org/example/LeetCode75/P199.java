package org.example.LeetCode75;

import org.example.data.TreeNode;

import java.util.*;

public class P199 {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (i == 0) {
                    result.add(node.getVal());
                }

                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
                if (node.getLeft()!= null) {
                    queue.add(node.getLeft());
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        P199 p = new P199();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5, null, null)), new TreeNode(3, null, new TreeNode(4, null ,null)));
        p.rightSideView(root);
    }
}
