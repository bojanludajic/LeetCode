package daily;

import random.LC296;

public class LC2096 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(4);
        root.left = left;
        root.right = right;
        left.left = treeNode;
        right.left = treeNode1;
        right.right = treeNode2;
        System.out.println(getDirections(root, 3, 6));

    }

    public static String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode lca = dfs(root, startValue, destValue);
        StringBuilder startPath = new StringBuilder();
        StringBuilder destPath = new StringBuilder();
        pathFinder(lca, startValue, startPath);
        pathFinder(lca, destValue, destPath);

        StringBuilder getDirections = new StringBuilder();
        getDirections.append("U".repeat(startPath.length()));
        getDirections.append(destPath);

        return getDirections.toString();
    }

    public static boolean pathFinder(TreeNode root, int val, StringBuilder sb) {
        if(root == null) {
            return false;
        }
        if(root.val == val) {
            return true;
        }
        sb.append("L");
        if(pathFinder(root.left, val, sb)) {
            return true;
        }
        sb.setLength(sb.length() - 1);

        sb.append("R");
        if(pathFinder(root.right, val, sb)) {
            return true;
        }
        sb.setLength(sb.length() - 1);

        return false;
    }

    public static TreeNode dfs(TreeNode root, int val1, int val2) {
        if(root == null || root.val == val1 || root.val == val2) {
            return root;
        }
        TreeNode left = dfs(root.left, val1, val2);
        TreeNode right = dfs(root.right, val1, val2);
        if(left != null && right != null) {
            return root;
        }
        return left != null ? left : right;
    }



}
