package W1Day7;

import W1Day6.TreeNode2;

import java.util.List;

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
   static   int  Cdepth =0;
    static int  depth = 0;
  static   public int maxDepth(TreeNode root) {
      if (root == null) return 0;
      return foo(root);
  }
    static   private int foo(TreeNode root) {
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
        TreeNode t = new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        Solution.maxDepth(t);
    }
}
