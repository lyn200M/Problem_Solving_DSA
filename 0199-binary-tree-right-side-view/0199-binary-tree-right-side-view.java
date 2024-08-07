/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return (new ArrayList<>());
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        
        queue.add(root);
        while (!queue.isEmpty()) {
            int i = 0;
            int size = queue.size();
            int right = 0;
            while (i < size) {
                TreeNode node = queue.remove();
                right = node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null)
                    queue.add(node.right);
                i++;
            }
            ans.add(right);
        }
        return (ans);
    }
}