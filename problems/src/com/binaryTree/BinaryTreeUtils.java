package com.binaryTree;

/**
 * @author avinash.a.mishra
 */
public class BinaryTreeUtils {

    public BinaryTree constructBinaryTree(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        return tree;
    }


}
