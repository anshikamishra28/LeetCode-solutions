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
     List<List<Integer>> result=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        int targetSum;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       this.targetSum=targetSum;
        dfs(root,0);    
        return result;        
    }
    public void dfs(TreeNode node,int currentsum){
        if(node==null) return;
        path.add(node.val);
        currentsum+=node.val;
        if(currentsum==targetSum && node.left==null && node.right==null){
            result.add(new ArrayList<>(path));
        }
        dfs(node.left,currentsum);
        dfs(node.right,currentsum);
        path.remove(path.size()-1);

    }
}