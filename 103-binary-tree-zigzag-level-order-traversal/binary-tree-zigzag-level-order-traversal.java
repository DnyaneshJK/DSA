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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        TreeNode curr = root;
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(curr);
        int c1 = 1;
        while (q.size() > 0) {
            int n = q.size();
            
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode c = q.poll();
                if (c1 % 2 == 0) {
                     l.add(0,c.val);
                    } else{
                        l.add(c.val);
                    }
                    
                    if (c.left != null) {
                        q.offer(c.left);
                    }
                    if (c.right != null) {
                        q.offer(c.right);
                    } 
                        }
                
                ans.add(l);
                c1++;
            }

    return ans;
}
}