package com.company;

public class BinarySearchTreeImpl<T extends Comparable<T>>
        implements BinarySearchTree<T> {

    private class TreeNode {
        T value;
        TreeNode left;
        TreeNode right;

        public TreeNode(T value) {
            this.value = value;
        }
    }

    private TreeNode root;

    @Override
    public void insert(T elem) {
        this.root = insert(this.root, elem);
    }

    private TreeNode insert(TreeNode root, T elem) {
        if (root == null) {
            root = new TreeNode(elem);
        } else {
            if (root.value.compareTo(elem) >= 0) {
                root.left = insert(root.left, elem);
            } else {
                root.right = insert(root.right, elem);
            }
        }
        return root;
    }

    @Override
    public boolean remove(T elem) {
        return false;
    }

    @Override
    public boolean contains(T elem) {
        return false;
    }

    @Override
    public void printAll() {
        printAll(this.root);
    }

    private void printAll(TreeNode root) {
        if (root != null) {
            printAll(root.left);
            System.out.println(root.value);
            printAll(root.right);
        }
    }

    @Override
    public void printAllByLevels() {

    }
}
