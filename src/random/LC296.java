package random;

import com.sun.source.tree.Tree;

public class LC296 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(1);
        TreeNode treeNode = new TreeNode(6);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(0);
        TreeNode treeNode3 = new TreeNode(8);
        TreeNode treeNode4 = new TreeNode(7);
        TreeNode treeNode5 = new TreeNode(4);
        root.left = left;
        root.right = right;
        left.left = treeNode;
        left.right = treeNode1;
        right.left = treeNode2;
        right.right = treeNode3;
        treeNode.left = treeNode4;
        treeNode.right = treeNode5;
        System.out.println(lowestCommonAncestor(root, treeNode4, treeNode5).val);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left!= null && right != null) {
           return root;
        }
        return left != null ? left : right;
    }

}
