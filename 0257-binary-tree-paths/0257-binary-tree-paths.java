class Solution {
    List<String>ans=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root,"",ans);
        return ans;
    }
    public void dfs(TreeNode node,String path,List<String>ans){
        if(node==null) return;
        if(node.left==null && node.right==null)  ans.add(path+node.val);
        dfs(node.left,path+node.val+"->",ans);
        dfs(node.right,path+node.val+"->",ans);
    
    }
}