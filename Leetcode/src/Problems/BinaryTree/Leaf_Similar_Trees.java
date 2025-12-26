package Problems.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Leaf_Similar_Trees {

    public static class TreeNode {
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

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> values1 = new ArrayList<>();
        List<Integer> values2 = new ArrayList<>();
        dfs(root1, values1);
        dfs(root2, values2);
        return values1.equals(values2);     
    }

    public static void dfs(TreeNode root, List<Integer> listOfLeafValues) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                listOfLeafValues.add(root.val);
            } else {
                dfs(root.left, listOfLeafValues);
                dfs(root.right, listOfLeafValues);
            }
        }
    }
}
