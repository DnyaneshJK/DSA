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

        TreeNode cn = root;
        List<Integer> l = new ArrayList<>();
        if(root==null) return l;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(cn);

        while(q.size()>0){
            int size=q.size();
            for(int i=0;i<size;i++){
            TreeNode tn = q.poll();
            if(i==size-1){
                l.add(tn.val);
            }
            if(tn.left!=null){
                q.add(tn.left);
            }
            if(tn.right!=null){
                q.add(tn.right);
            } 
            }
        }
        return l;
    }
}