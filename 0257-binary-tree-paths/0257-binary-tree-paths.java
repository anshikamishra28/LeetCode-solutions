class Solution {
    List<String>ans=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        helper(root,"",ans);
        return ans;
    }
    public void helper(TreeNode root,String path,List<String>ans){
        if(root==null) return;
        if(root.left==null && root.right==null)
        ans.add(path+root.val);
        helper(root.left,path+root.val+"->",ans);
        helper(root.right,path+root.val+"->",ans);
    
    }
}