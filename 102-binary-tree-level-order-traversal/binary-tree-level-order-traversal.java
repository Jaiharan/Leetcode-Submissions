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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // // level order traversal
        // Queue<TreeNode> q = new LinkedList<>();
        // List<List<Integer>> ans = new ArrayList<>();
        // if(root == null) return ans;
        // q.offer(root);
        // while(!q.isEmpty()) {
        //     int levelNum = q.size();
        //     List<Integer> subList = new ArrayList<>();
        //     for(int i = 0; i < levelNum; i++) {
        //         if(q.peek().left != null) q.offer(q.peek().left);
        //         if(q.peek().right != null) q.offer(q.peek().right);
        //         subList.add(q.poll().val);
        //     }
        //     ans.add(subList);
        // }
        // return ans;
        List<List<Integer>> res = new ArrayList<>();
        bfs(root, res, 0);
        return res;
    }

    private void bfs(TreeNode root, List<List<Integer>> res, int layer) {
        if(root == null) {
            return;
        }
        if(res.size() == layer) {
            List<Integer> l = new ArrayList<>();
            l.add(root.val);
            res.add(l);
        } else {
            res.get(layer).add(root.val);
        }
        bfs(root.left, res ,layer + 1);
        bfs(root.right, res ,layer + 1);
    }
}