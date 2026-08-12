class Solution {
    public void flatten(TreeNode root) {
        // make a linked list of preeorder of the tree in such a way that left of node is null and right is the next node
        ArrayList<TreeNode> arr=new ArrayList<>();
        dfs(root,arr);
        for(int i=0;i<arr.size()-1;i++){
            TreeNode a=arr.get(i);
            TreeNode b=arr.get(i+1);
            a.right=b;
            a.left=null;
        }
    }
    public void dfs(TreeNode root,ArrayList<TreeNode>arr){
        if(root==null) return;
        arr.add(root);
        dfs(root.left,arr);
        dfs(root.right,arr);
    }
}