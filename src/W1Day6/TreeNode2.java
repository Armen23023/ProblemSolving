package W1Day6;

import java.util.ArrayList;
import java.util.List;
// 94
public class TreeNode2 {
      int val;
      TreeNode2 left;
      TreeNode2 right;
      TreeNode2() {}
      TreeNode2(int val) { this.val = val; }
      TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution2 {
   static public List<Integer> inorderTraversal(TreeNode2 root) {
       return foo(root, new ArrayList<>());
   }

  static   private List<Integer> foo(TreeNode2 root, List<Integer> list) {
        if (root == null) {
            return list;
        }

        list = foo(root.left, list);

        list.add(root.val);

        return  foo(root.right, list);

    }
    public static void main(String[] args) {
        TreeNode2 tn = new TreeNode2(1,null,new TreeNode2(2,new TreeNode2(3),null));
        Solution2.inorderTraversal(tn);
    }
}
