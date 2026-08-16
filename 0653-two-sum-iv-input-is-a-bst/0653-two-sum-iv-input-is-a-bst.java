class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer>values=new ArrayList<>();
        dfs(root,values);
        for(int i=0;i<values.size();i++){
            for(int j=i+1;j<values.size();j++){
                if(values.get(i)+values.get(j)==k){
                    return true;
                }
            }
        }
        return false;
        
    }
    public void dfs(TreeNode node,List<Integer>values){
        if(node==null) return;
        dfs(node.left,values);
        values.add(node.val);
        dfs(node.right,values);

    }
}