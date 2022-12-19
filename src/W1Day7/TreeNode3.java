package W1Day7;

public class TreeNode3 {
      int val;
      TreeNode3 left;
      TreeNode3 right;
      TreeNode3() {}
      TreeNode3(int val) { this.val = val; }
      TreeNode3(int val, TreeNode3 left, TreeNode3 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
  // 185/228      110. Balanced Binary Tree
class Solution3 {
    static  int depth = 0;
   static public boolean isBalanced(TreeNode3 root) {
        int l = 0;
        int r = 0;
            if (root == null) return true;
            if (root.left!=null) {
                l = foo(root.left, l);
            }
             depth = 0;
            if (root.right!=null) {
                r = foo(root.right, r);
            }
       if (l - r == 0 || l-r ==1 || l-r ==-1){
           return true;
       }
       else return false;
        }
        static   private int foo(TreeNode3 root,int val) {
            boolean b = false;
            val++;
            if (root.left!=null){
                foo(root.left,val);
                b = true;
            }
            if (root.right!=null){
                foo(root.right,val);
                b = true;
            }
            if (val>depth && b == true){
                depth = val;
            }

            return depth;
    }


    public static void main(String[] args) {
        TreeNode3 t = new TreeNode3(1,null,new TreeNode3(2,null,new TreeNode3(3)));
        Solution3.isBalanced(t);
        }
}
