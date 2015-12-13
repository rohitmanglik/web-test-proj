package com.rohit.Trees;

/**
 * Created by PPP on 1/4/2015.
 */
public class CreateTree {
    public static void main(String[] args) {
        Node<Integer> root = new Node<Integer>(1);
        Node<Integer> root1 = new Node<Integer>(2);
        Node<Integer> root2 = new Node<Integer>(3);
        Node<Integer> root11 = new Node<Integer>(4);
        Node<Integer> root12 = new Node<Integer>(5);
        Node<Integer> root21 = new Node<Integer>(6);
        Node<Integer> root22 = new Node<Integer>(7);

        root.setLeft(root1);
        root.setRight(root2);

        root1.setLeft(root11);
        root1.setRight(root12);
        root2.setLeft(root21);
        root2.setRight(root22);

        CreateTree createTree = new CreateTree();
        createTree.inorderTraversal(root);
    }

    public void inorderTraversal(Node<Integer> root) {
        if(root.getLeft() != null)
            inorderTraversal(root.getLeft());

        System.out.println(root.getData() + ", ");

        if(root.getRight() != null)
            inorderTraversal((root.getRight()));
    }
}
