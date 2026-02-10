package org.example.dsa.tree;

import java.util.Stack;

public class BinarySearchTreeTest {

    static void main() {
        BinarySearchTree bst = new BinarySearchTree();
        int k = 2;

        bst.add(5);
        bst.add(3);
        bst.add(7);
        bst.add(2);
        bst.add(4);
        bst.add(6);
        bst.add(8);

        System.out.println(k +" th smallest number = "+kthSmallestNumber(bst, k));

    }

    public static Integer kthSmallestNumber(BinarySearchTree bst, int k) {
        Integer smallest = 0;
        Stack<BinarySearchTree.Node> stack = new Stack<>();
        BinarySearchTree.Node curr = bst.root;
        while(curr != null || !stack.isEmpty()) {
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            k--;
            if(k == 0) {
                smallest = curr.value;
                break;
            }
            curr = curr.right;
        }
        return smallest;
    }
}

class BinarySearchTree {

    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    Node root;
    public BinarySearchTree() {
        this.root = null;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }
    private Node addRecursive(Node current, int value) {

        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }
    public void inOrder() {
        inOrderTraversal(root);
        System.out.println();
    }

    private void inOrderTraversal(Node node) {
        if (node == null) return;

        inOrderTraversal(node.left);
        System.out.print(node.value + " ");
        inOrderTraversal(node.right);
    }

}