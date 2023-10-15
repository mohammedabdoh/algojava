package com.mohammedabdoh.dsa.datastructures.tree.binary_tree;

public class DeleteANodeGreaterThanOrEqualToK {
    public static Node solution(Node root, int k) {
        // first check if we need to traverse the left subtree or the right subtree
        if (root.data >= k) {
            root = root.left;
        } else {
            root = root.right;
        }

        while (root.left != null) {
            if (root.left.data >= k) {
                root = root.left;
                continue;
            } else {
                return root;
            }
        }

        return root;
    }
}
