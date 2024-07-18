package daily;

import com.sun.source.tree.Tree;

import java.security.KeyStore;
import java.util.*;

public class LC1110 {

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
//        TreeNode root = new TreeNode(1);
//        TreeNode left = new TreeNode(2);
//        TreeNode right = new TreeNode(3);
//        TreeNode treeNode = new TreeNode(4);
//        TreeNode treeNode1 = new TreeNode(5);
//        TreeNode treeNode2 = new TreeNode(6);
//        TreeNode treeNode3 = new TreeNode(7);
//        root.left = left;
//        root.right = right;
//        left.left = treeNode;
//        left.right = treeNode1;
//        right.left = treeNode2;
//        right.right = treeNode3;
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(4);
        root.left = left;
        left.left = node1;
        left.right = node2;
        int[] arr = {2, 3};
        System.out.println(delNodes(root, arr));

    }

    public static List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Map<Integer, TreeNode> valNode = new HashMap<>();
        valueNodePairing(root, valNode);
        List<Integer> toRemove = new ArrayList<>();
        for(int i : to_delete) {
            toRemove.add(i);
        }
        List<TreeNode> res = new ArrayList<>();
        if(!toRemove.contains(root.val)) {
            res.add(root);
        }
        for(Map.Entry<Integer, TreeNode> entry : valNode.entrySet()) {
            TreeNode node = entry.getValue();
            if(toRemove.contains(node.val)) {
                if(node.left != null && !toRemove.contains(node.left.val)) {
                    res.add(node.left);
                }
                if(node.right != null && !toRemove.contains(node.right.val)) {
                    res.add(node.right);
                }
            }
        }
        for(TreeNode node : res) {
            detatch(node, toRemove);
        }
        return res;
    }
    public static void detatch(TreeNode root, List<Integer> toRemove) {
        if(root == null) {
            return;
        }
        if(root.left != null) {
            if(toRemove.contains(root.left.val)) {
                root.left = null;
            } else {
                detatch(root.left, toRemove);
            }
        }
        if(root.right != null) {
            if(toRemove.contains(root.right.val)) {
                root.right = null;
            } else {
                detatch(root.right, toRemove);
            }

        }
    }
    public static void valueNodePairing(TreeNode root, Map<Integer, TreeNode> valNode) {
        if(root == null) {
            return;
        }
        valNode.put(root.val, root);
        valueNodePairing(root.left, valNode);
        valueNodePairing(root.right, valNode);

    }
}
