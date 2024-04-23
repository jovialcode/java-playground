package org.jovialcode.jdk1_2;

import org.junit.jupiter.api.Test;

public class BinaryTreeTest {
    @Test
    void createBinaryTree(){
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.insert(3);
        binaryTree.insert(5);
        binaryTree.insert(7);
        binaryTree.insert(9);
    }
}
