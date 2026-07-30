
class Solution {
    static int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max=0;
        levels(root);
        return max;
        
    }
    public int levels(TreeNode root){
        if(root==null) return 0;
        int leftlevels=levels(root.left);
        int rightlevels=levels(root.right);
        max=Math.max(max,leftlevels+rightlevels);
        return 1+Math.max(leftlevels,rightlevels);
    }
}