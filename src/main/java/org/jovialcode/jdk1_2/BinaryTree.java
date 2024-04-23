package org.jovialcode.jdk1_2;

import java.util.Objects;

public class BinaryTree<T> {
    private final TreeNode<T> root;

    public BinaryTree() {
        this.root = new TreeNode<>(null);
    }

    public boolean insert(T t){
        return findAndInsertNode(root, t);
    }

    private boolean findAndInsertNode(TreeNode<T> currentNode, T value){
        if (Objects.isNull(currentNode)) {
            return false;
        }

        if(Objects.isNull(currentNode.left)){
            currentNode.left = new TreeNode<>(value);
            return true;
        }else if(Objects.isNull(currentNode.right)){
            currentNode.right = new TreeNode<>(value);
            return true;
        }

        return findAndInsertNode(currentNode.left, value) || findAndInsertNode(currentNode.right, value);
    }

    private static class TreeNode<T>{
        T val;
        TreeNode<T> left;
        TreeNode<T> right;

        public TreeNode() {
        }

        public TreeNode(T val) {
            this.val = val;
        }

        public TreeNode(T val, TreeNode<T> left, TreeNode<T> right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
