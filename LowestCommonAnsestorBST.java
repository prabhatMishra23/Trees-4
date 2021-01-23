/*Time COmplexity - O(N)
SPace COmplexity - O(N)
*/
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return root;
        }
        if(p.val < root.val && q.val<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }else if(p.val > root.val && q.val>root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        
        return root;
    }
}