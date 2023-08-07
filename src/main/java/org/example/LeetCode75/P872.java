package org.example.LeetCode75;

import org.example.data.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> visited1 = new Stack<>();
        Stack<TreeNode> visited2 = new Stack<>();
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();

        visited1.push(root1);
        visited2.push(root2);

        while (!visited1.isEmpty()) {
            TreeNode node = visited1.pop();

            if (node.getLeft() != null) {
                visited1.push(node.getLeft());
            }

            if (node.getRight() != null) {
                visited1.push(node.getRight());
            }

            if (node.getLeft() == null && node.getRight() == null) {
                leaf1.add(node.getVal());
            }
        }

        while (!visited2.isEmpty()) {
            TreeNode node = visited2.pop();

            if (node.getLeft() != null) {
                visited2.push(node.getLeft());
            }

            if (node.getRight() != null) {
                visited2.push(node.getRight());
            }

            if (node.getLeft() == null && node.getRight() == null) {
                leaf2.add(node.getVal());
            }
        }

        return leaf1.equals(leaf2);
    }

    public static void main(String[] args) {
        P872 p = new P872();
        TreeNode root1 = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                        new TreeNode(1, new TreeNode(9), new TreeNode(8)));

        TreeNode root2 = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(7)),
                        new TreeNode(1, new TreeNode(4), new TreeNode(2, new TreeNode(9), new TreeNode(8))));
        p.leafSimilar(root1, root2);
    }
}
