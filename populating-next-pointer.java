// Time Complexity : O(n), n -> Number of nodes in the tree
// Space Complexity : O(log n), log n -> Size of recursion stack
class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
        dfs(root.left, root.right);
        return root;      
    }
    
    private void dfs(Node left, Node right) {
        //base
        if(left == null) return;
        //logic
        left.next = right;
        dfs(left.left, left.right);
        dfs(left.right, right.left);
        dfs(right.left, right.right);
    }
}