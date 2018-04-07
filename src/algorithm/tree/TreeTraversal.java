package algorithm.tree;

import java.util.Stack;

public class TreeTraversal {

    public void preOrderRecursive(TreeNode root) {
        if (root != null) {
            System.out.print(root.val);
            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }
    }

    public void inOrderRecursive(TreeNode root) {
        if (root != null) {
            inOrderRecursive(root.left);
            System.out.print(root.val);
            inOrderRecursive(root.right);
        }
    }

    public void postOrderRecursive(TreeNode root) {
        if (root != null) {
            postOrderRecursive(root.left);
            postOrderRecursive(root.right);
            System.out.print(root.val);
        }
    }

    public void preOrderIteretor(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        if (!stack.empty()) {
            root = stack.pop();
            System.out.print(root.val);
            stack.push(root.right);
            stack.push(root.left);
        }
    }

    public void inOrderIteretor(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            if (!stack.empty()) {
                root = stack.pop();
                System.out.print(root.val);
                root = root.right;
            }
        }

    }

    public void postOrderIteretor(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<Integer> result = new Stack<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode treeNode = stack.pop();
            if (treeNode.left != null)
                stack.push(treeNode.left);
            if (treeNode.right != null)
                stack.push(root.right);
            result.push(treeNode.val);
        }

        while (!result.isEmpty()){
            System.out.print(result.pop());
        }
    }
}
