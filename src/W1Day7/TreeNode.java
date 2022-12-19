package W1Day7;

public class TreeNode {
     int val;
      TreeNode2 left;
      TreeNode2 right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode2 left, TreeNode2 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}


class Solution {
   static   int  Cdepth =0;
    static int  depth = 0;
  static   public int maxDepth(TreeNode2 root) {
      if (root == null) return 0;
      return foo(root);
  }
    static   private int foo(TreeNode2 root) {
      Cdepth++;                         //Space -> O(n)
      if (root.left!=null){
          foo(root.left);
      }                                 // Time complex  -> O(n)
      if (root.right!=null){
          foo(root.right);
      }
      if (Cdepth>depth){
          depth = Cdepth;
      }
      Cdepth--;
      return depth;
    }

    public static void main(String[] args) {
        TreeNode2 t = new TreeNode2(3,new TreeNode2(9),new TreeNode2(20,new TreeNode2(15),new TreeNode2(7)));
        Solution.maxDepth(t);
    }
}
