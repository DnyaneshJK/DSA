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

        List<List<Integer>> l = new ArrayList<>();
        if(root==null) return l;
        TreeNode tn = root;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(tn);

        while(q.size()>0){
            List<Integer> ans = new ArrayList<>();
            int n = q.size();
            for(int i=0;i<n;i++){
             TreeNode tn1 = q.poll();
             ans.add(tn1.val);
             if(tn1.left!=null){
                q.add(tn1.left);
             }
             if(tn1.right!=null){
                q.add(tn1.right);
             }
            }
            l.add(ans);
        }
        return l;
    }
}