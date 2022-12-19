package W1Day7;
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
 // 617. Merge Two Binary Trees
class Solution2 {
  static   public TreeNode2 mergeTrees(TreeNode2 root1, TreeNode2 root2) {
      if (root1==null && root2==null){
          return null;
      }
      if( root1==null&&root2!=null){
          root1 = new TreeNode2(0,null,null);
      }
      if (root1!=null && root2!=null){
          root1.val = root1.val+root2.val;
      }

      if(root1!=null && root2==null){
          return root1;
      }


      if( root1.left==null&&root2.left!=null){
          root1.left = new TreeNode2(0,null,null);
      }

      if(root1.left!=null&&root2.left!=null){
          mergeTrees(root1.left,root2.left);        // Time Complex O(n);
      }



      if(root1.right==null&&root2.right!=null){
          root1.right = new TreeNode2(0,null,null);
      }
      if(root1.right!=null&&root2.right!=null){
          mergeTrees(root1.right,root2.right);
      }

      return root1;
      }


    public static void main(String[] args) {
        TreeNode2 t = new TreeNode2(1,new TreeNode2(3,new TreeNode2(5),null),new TreeNode2(2,null,null));
        TreeNode2 t2 = new TreeNode2(2,new TreeNode2(1,null,new TreeNode2(4)),new TreeNode2(3,null,new TreeNode2(7)));
        Solution2.mergeTrees(t,t2);
    }
  }
