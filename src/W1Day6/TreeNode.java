package W1Day6;

//   700
public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {

        while(root!=null){
            if(val == root.val){
                return root;
            }                           //O(log n)
            if(val<root.val){
                root = root.left;
            }else{
                root = root.right;
            }
        }
        return null;
    }
}
