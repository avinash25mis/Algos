package com.binaryTree;

/**
 * @author avinash.a.mishra
 */
public class Node {
    public int key;
    public Node left, right;

    public Node()
    {

    }

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
