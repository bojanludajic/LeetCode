package daily;

import java.util.*;

public class LC2916 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {

        }
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
        int[][] arr = {{20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}, {80, 19, 1}};
        createBinaryTree(arr);
    }

    public static TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> nodes = new HashMap<>();
        Set<Integer> children = new HashSet();
        for(int i = 0; i < descriptions.length; i++) {
            int p = descriptions[i][0];
            int c = descriptions[i][1];
            int lr = descriptions[i][2];
            TreeNode parent = nodes.getOrDefault(p, new TreeNode(p));
            TreeNode child = nodes.getOrDefault(c, new TreeNode(c));
            nodes.put(p, parent);
            nodes.put(c, child);
            children.add(c);
            if(lr == 1) {
                parent.left = child;
            } else {
                parent.right = child;
            }
        }
        for(int node : nodes.keySet()) {
            if(!children.contains(node)) {
                return nodes.get(node);
            }
        }
        return null;
    }
}