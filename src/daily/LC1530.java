package daily;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC1530 {

    static class TreeNode {
        public int val;
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
        public String toString() {
            return val + "";
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(80);
        root.left = new TreeNode(62);
        root.right = new TreeNode(99);
        root.left.left = new TreeNode(36);
        root.left.right = new TreeNode(45);
        root.right.left = new TreeNode(39);
        root.right.right = new TreeNode(76);
        root.left.left.left = new TreeNode(81);
        root.left.left.right = new TreeNode(44);
        root.left.right.left = new TreeNode(23);
        root.left.right.right = new TreeNode(58);
        root.right.left.left = new TreeNode(8);
        root.right.left.right = new TreeNode(14);
        root.right.right.left = new TreeNode(1);
        root.right.right.right = new TreeNode(94);
        root.left.left.left.left = new TreeNode(100);
        root.left.left.left.right = new TreeNode(10);
        root.left.left.right.left = new TreeNode(8);
        root.left.left.right.right = new TreeNode(30);
        root.left.right.left.left = new TreeNode(75);
        root.left.right.left.right = new TreeNode(7);
        root.left.right.right.left = new TreeNode(33);
        root.left.right.right.right = new TreeNode(80);
        root.right.left.left.left = new TreeNode(44);
        root.right.left.left.right = new TreeNode(2);
        root.right.left.right.left = new TreeNode(67);
        root.right.left.right.right = new TreeNode(78);
        root.right.right.left.left = new TreeNode(64);
        root.right.right.left.right = new TreeNode(30);
        root.right.right.right.left = new TreeNode(98);
        root.right.right.right.right = new TreeNode(100);
        root.left.left.left.left.left = new TreeNode(24);
        root.left.left.left.left.right = new TreeNode(48);
        root.left.left.left.right.left = new TreeNode(42);
        root.left.left.left.right.right = new TreeNode(31);
        root.left.left.right.left.left = new TreeNode(91);
        root.left.left.right.left.right = new TreeNode(37);
        root.left.left.right.right.left = new TreeNode(81);
        root.left.left.right.right.right = new TreeNode(45);
        root.left.right.left.left.left = new TreeNode(30);
        root.left.right.left.left.right = new TreeNode(77);
        root.left.right.left.right.left = new TreeNode(28);
        System.out.println(countPairs(root, 8));

    }

    public static int countPairs(TreeNode root, int distance) {
        List<TreeNode> leaves = new ArrayList<>();
        findLeaves(root, leaves);
        int count = 0;
        Map<TreeNode, Map<TreeNode, Integer>> distances = new HashMap<>();
        for(int i = 0; i < leaves.size() - 1; i++) {
            for (int j = i + 1; j < leaves.size(); j++) {
                int dist = distanceBetweenLeaves(root, leaves.get(i), leaves.get(j));
                if(dist <= distance) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void findLeaves(TreeNode root, List<TreeNode> list) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            list.add(root);
        }
        findLeaves(root.left, list);
        findLeaves(root.right, list);
        return;
    }

    public static TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);
        if(left != null && right != null) {
            return root;
        }
        return left != null? left : right;
    }

    public static int distanceFromAncestor(TreeNode ancestor, TreeNode p) {
        if(ancestor == null) {
            return -1;
        }
        if(ancestor == p) {
            return 0;
        }
        int left = distanceFromAncestor(ancestor.left, p);
        int right = distanceFromAncestor(ancestor.right, p);
        if(left == -1 && right == - 1) {
            return -1;
        }

        return (left != -1) ? left + 1 : right + 1;
    }

    public static int distanceBetweenLeaves(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode lca = lca(root, p, q);
        return distanceFromAncestor(lca, p) + distanceFromAncestor(lca, q);
    }


}
